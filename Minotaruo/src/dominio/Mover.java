package dominio;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Mover {

    private int[] posicion = new int[2];
    private int[] fin = new int[2];
    private static String player = "o";

    public int[] getPosicion() {
        return posicion;
    }

    public int[] getFin(){
        return fin;
    }

    public Consumer<String[][]> down = x -> {
        if(!x[posicion[0]+1][posicion[1]].equals("█")){
            x[posicion[0]][posicion[1]] = " ";
            x[posicion[0] + 1][posicion[1]] = player;
            posicion[0]++;
        }
    };
    public Consumer<String[][]> up = x -> {
        System.out.println("down");
        if(!x[posicion[0]-1][posicion[1]].equals("█")){
            x[posicion[0]][posicion[1]] = " ";
            x[posicion[0] - 1][posicion[1]] = player;
            posicion[0]--;
        }
    };
    public Consumer<String[][]> right = x -> {
        if(!x[posicion[0]][posicion[1]+1].equals("█")){
            x[posicion[0]][posicion[1]] = " ";
            x[posicion[0]][posicion[1]+1] = player;
            posicion[1]++;
        }
    };
    public Consumer<String[][]> left = x -> {
        if(!x[posicion[0]][posicion[1] - 1].equals("█")){
            x[posicion[0]][posicion[1]] = " ";
            x[posicion[0]][posicion[1] - 1] = player;
            posicion[1]--;
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
                    fin[0] = i;
                    fin[1] = j;
                }
            }
        }
    };
}
