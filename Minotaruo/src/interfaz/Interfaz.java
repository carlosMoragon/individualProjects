package interfaz;

import dominio.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Interfaz {

    public void procesarLlamada(){
        Scanner sc = new Scanner(System.in);
        Map<String, Consumer> mover = new HashMap<>();
        Mapa inicio = new Mapa(new File("lab5.txt"));


        Mover jugador = new Mover(new Players("o", new int[]{0,0}));
        Mover minotauro = new Mover(new Players("M", new int[]{0,0}));
        Mover salida = new Mover(new Players("@", new int[]{0,0}));

        inicio.inicializacion();

        jugador.getPlayer().setPosicionRandom(inicio.getDimensiones());
        salida.getPlayer().setPosicionRandom(inicio.getDimensiones());
        minotauro.getPlayer().setPosicionRandom(inicio.getDimensiones());

        jugador.colocar.accept(inicio.getPlano());
        salida.colocar.accept(inicio.getPlano());
        minotauro.colocar.accept(inicio.getPlano());

        jugador.reset.accept(inicio.getPlano(), inicio.getDimensiones());

        inicio.print.accept(inicio.getPlano());

        mover.put("a", jugador.left);
        mover.put("s", jugador.down);
        mover.put("d", jugador.right);
        mover.put("w", jugador.up);

        String ctrl = "";
        while(!ctrl.equalsIgnoreCase("exit")){
            ctrl = sc.next();
            if(mover.keySet().contains(ctrl)) {
                mover.get(ctrl).accept(inicio.getPlano());
                minotauro.aleatorio.accept(inicio.getPlano(), jugador.getPlayer().getPosicion());



            /* if("god".equals(ctrl)){
                int[] x = new int[2];
                x[0] = 5;
                x[1] = 5;
                jugador.kameHameJa.accept(inicio.getPlano(), x);
            }*/

                if (jugador.getPlayer().getPosicion()[0] == salida.getPlayer().getPosicion()[0] && jugador.getPlayer().getPosicion()[1] == salida.getPlayer().getPosicion()[1]) {
                    ctrl = "exit";
                    System.out.println("FELICIDADES HAS GANADO!!!!");
                } else if (jugador.getPlayer().getPosicion()[0] == minotauro.getPlayer().getPosicion()[0] && jugador.getPlayer().getPosicion()[1] == minotauro.getPlayer().getPosicion()[1]) {
                    minotauro.colocar.accept(inicio.getPlano());
                    System.out.println("HAS PERDIDO :(");
                    ctrl = "exit";
                }

                //Comprobar qu funciona en la consola
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //inicio.print.accept(inicio.getPlano());
                inicio.printNiebla.accept(jugador.getPlayer().getPosicion());
            }
        }
    }
}
