package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Mapa{
    private final int[] dimensiones = new int[2];
    private File MAPA ;
    private String[][] plano ;
    private int densidad = 2;

    public int[] getDimensiones() {
        return dimensiones;
    }

    public String[][] getPlano(){
        return plano;
    }

    public Mapa(File MAPA){
        this.MAPA = MAPA;
    }

    public void inicializacion() {
        String lineaMAP = "";
        try {
            Scanner sc = new Scanner(MAPA);
            while (sc.hasNext()) {
                lineaMAP += sc.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        plano = graficos(lineaMAP);

    }

    private String[][] graficos(String cadena) {
        String[] una = cadena.split("\n");
        String[][] dos = new String[una.length][una[0].length()];
        for (int i = 0; i < una.length; i++) {
            for (int j = 0; j < una[0].length(); j++) {
                dos[i][j] = una[i].split("")[j];
            }
        }
        dimensiones[0] = una.length;
        dimensiones[1] = una[0].length();
        return dos;
    }

    public Consumer<String[][]> print = x -> {
        for(int i = 0; i < dimensiones[0]; i++){;
            for(int j = 0; j < dimensiones[1]; j++) {
                if(j == dimensiones[1]-1){
                    if (x[i][j].equals("X")) {
                        System.out.println("█");
                    }else{
                        System.out.println(x[i][j]);
                    }
                }else{
                    if (x[i][j].equals("X")) {
                        System.out.print("█");
                    }else {
                        System.out.print(x[i][j]);
                    }
                }
            }
        }
    };

    public Consumer<int[]> printNiebla = x -> {
        for(int i = 0; i < dimensiones[0]; i++){;
            for(int j = 0; j < dimensiones[1]; j++) {
                final int I = i;
                final int J = j;
                if(Stream.iterate(-1, y -> y + 1).limit((int)Math.pow(2,densidad) +1 ).anyMatch(y -> y + x[0] == I ) && Stream.iterate(-1, y -> y + 1).limit((int)Math.pow(2,densidad) +1 ).anyMatch(y -> y + x[1] == J)) {
                    if(j == x[1]+(int)Math.pow(2,densidad)-1){
                        if (plano[i][j].equals("X")) {
                            System.out.println("█");
                        }else{
                            System.out.println(plano[i][j]);
                        }
                    }else{
                        if (plano[i][j].equals("X")) {
                            System.out.print("█");
                        }else{
                            System.out.print(plano[i][j]);
                        }
                    }
                }
            }
        }
    };

    public Consumer<int[]> printFaro = x -> {

    };
}
