package dominio;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Mover {
    private int[] posicion = new int[2];
    private static String player = "🐏";

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
    public BiConsumer<String[][], int[]> up = (x,y) -> {
        if(!x[y[0]+1][y[1]].equals("█")){
            x[y[0]][y[1]] = " ";
            x[y[0] + 1][y[1]] = player;
        }
    };
    public BiConsumer<String[][], int[]> down = (x,y) -> {
        if(!x[y[0]-1][y[1]].equals("█")){
            x[y[0]][y[1]] = " ";
            x[y[0] - 1][y[1]] = player;
        }
    };
    public BiConsumer<String[][], int[]> right = (x,y) -> {
        if(!x[y[0]][y[1]+1].equals("█")){
            x[y[0]][y[1]] = " ";
            x[y[0]][y[1]+1] = player;
        }
    };
    public BiConsumer<String[][], int[]> left = (x,y) -> {
        if(!x[y[0]][y[1] - 1].equals("█")){
            x[y[0]][y[1]] = " ";
            x[y[0]][y[1] - 1] = player;
        }
    };

    public BiConsumer<String[][], int[]> reset = (x, y) -> {
        for(int i = 0; i < y[0]; i++){
            for(int j = 0; j < y[1]; j++) {
                if (x[i][j].equals("S")) {
                    x[i][j] = player;
                    posicion[0] = i;
                    posicion[1] = j;
                }else if (x[i][j].equals("E")){
                    x[i][j] = "@";
                }
            }
        }
    };
}
