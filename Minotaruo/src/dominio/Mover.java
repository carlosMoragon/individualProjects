package dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Mover {


    //private int[] fin = new int[2];
    /*private static String player = "o";
    private static String minotauro = "M";*/
    private Players player;

    public Mover(Players player){
        this.player = player;
    }



    public Players getPlayer(){
        return player;
    }

    /*public int[] getFin(){
        return fin;
    }*/



    public Consumer<String[][]> down = x -> {
        if(!x[player.getPosicion()[0]+1][player.getPosicion()[1]].equals("X")){
            x[player.getPosicion()[0]][player.getPosicion()[1]] = " ";
            x[player.getPosicion()[0] + 1][player.getPosicion()[1]] = player.toString();
            player.getPosicion()[0]++;
        }
    };
    public Consumer<String[][]> up = x -> {
        if(!x[player.getPosicion()[0]-1][player.getPosicion()[1]].equals("X")){
            x[player.getPosicion()[0]][player.getPosicion()[1]] = " ";
            x[player.getPosicion()[0] - 1][player.getPosicion()[1]] = player.toString();
            player.getPosicion()[0]--;
        }
    };
    public Consumer<String[][]> right = x -> {
        if(!x[player.getPosicion()[0]][player.getPosicion()[1]+1].equals("X")){
            x[player.getPosicion()[0]][player.getPosicion()[1]] = " ";
            x[player.getPosicion()[0]][player.getPosicion()[1]+1] = player.toString();
            player.getPosicion()[1]++;
        }
    };
    public Consumer<String[][]> left = x -> {
        if(!x[player.getPosicion()[0]][player.getPosicion()[1] - 1].equals("X")){
            x[player.getPosicion()[0]][player.getPosicion()[1]] = " ";
            x[player.getPosicion()[0]][player.getPosicion()[1] - 1] = player.toString();
            player.getPosicion()[1]--;
        }
    };

    public BiConsumer<String[][], int[]> kameHameJa = (x,y) -> {
        for(int i = 0; i < 5; i++){
                x[y[0] + i][y[1] + 1] = " ";
                x[y[0] + i][y[1]] = " ";
                x[y[0]][y[1] + 1] = " ";
        }
    };

    public Consumer<String[][]> colocar = x -> {
        x[player.getPosicion()[0]][player.getPosicion()[1]] = player.toString() ;
    };

    public BiConsumer<String[][], int[]> reset = (x, y) -> {
        for(int i = 0; i < y[0]; i++){
            for(int j = 0; j < y[1]; j++) {
                if (x[i][j].equals("S")) {
                    x[i][j] = " ";
                    //player.toString();
                    //player.setPosicion(new int[]{i, j});
                }else if (x[i][j].equals("E")){
                    x[i][j] = " ";
                    //fin[0] = i;
                    //fin[1] = j;
                }
            }

        }
    };

    public BiConsumer<String[][], int[]> aleatorio = (x,y) -> {
        //System.out.println("s ejecuta");
        /*System.out.println(player.getPosicion()[0] - y[0]);
        System.out.println(x[player.getPosicion()[0]+1][player.getPosicion()[1]]);*/
        //derecha
        if(player.getPosicion()[0] - y[0] > 0 && !x[player.getPosicion()[0]+1][player.getPosicion()[1]].equals("X")){
            //System.out.println("entra");
            up.accept(x);
        }else if(player.getPosicion()[1] - y[1] > 0 && !x[player.getPosicion()[0]][player.getPosicion()[1]+1].equals("X")){
            right.accept(x);
        }else if(player.getPosicion()[1] - y[1] < 0 && !x[player.getPosicion()[0]][player.getPosicion()[1]+1].equals("X")){
            up.accept(x);
        }else {
            down.accept(x);
        }


    };
}
