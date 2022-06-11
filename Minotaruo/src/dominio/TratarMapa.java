package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Consumer;

public class TratarMapa {
    private static final int[] dimensiones = new int[2];
    private static File MAPA = new File("lab5.txt");
    //private static File MAPA = new File("lab10.txt");
    //private static File MAPA = new File("lab50.txt");

    public int[] getDimensiones() {
        return dimensiones;
    }

    public String[][] inicializacion() {
        String lineaMAP = "";
        try {
            Scanner sc = new Scanner(MAPA);
            while (sc.hasNext()) {
                lineaMAP += sc.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return graficos(lineaMAP);

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
                if (x[i][j].equals("X")) {
                    x[i][j] = "█";
                }
                if(j == dimensiones[1]-1){
                    System.out.println(x[i][j]);
                }else{
                    System.out.print(x[i][j]);
                }
            }
        }
    };
}
