package interfaz;

import dominio.*;

import java.io.File;
import java.util.Scanner;

public class Interfaz {

    public void procesarLlamada(){
        Scanner sc = new Scanner(System.in);
        Mapa inicio = new Mapa(new File("lab5.txt"));


        Mover jugador = new Mover(new Players("o", new int[]{0,0}));
        Mover minotauro = new Mover(new Players("M", new int[]{0,0}));


        inicio.inicializacion();

        minotauro.getPlayer().setPosicionRandom(inicio.getDimensiones());
        jugador.reset.accept(inicio.getPlano(), inicio.getDimensiones());
        minotauro.colocar.accept(inicio.getPlano());
        //IDEA: TRATAR A LA SALIDA COMO UN JUGADOR INMOVIL; PARA PODER USAR EL METODO COLOCAR
        inicio.print.accept(inicio.getPlano());

        String ctrl = "";
        while(!ctrl.equalsIgnoreCase("exit")){
            ctrl = sc.next();
            if("w".equals(ctrl)){
                jugador.up.accept(inicio.getPlano());
            }else if("s".equals(ctrl)){
                jugador.down.accept(inicio.getPlano());
            }else if ("a".equals(ctrl)){
                jugador.left.accept(inicio.getPlano());
            }else if ("d".equals(ctrl)){
                jugador.right.accept(inicio.getPlano());
            }else if("god".equals(ctrl)){
                int[] x = new int[2];
                x[0] = 5;
                x[1] = 5;
                jugador.kameHameJa.accept(inicio.getPlano(), x);
            }
            if(jugador.getPlayer().getPosicion()[0] == jugador.getFin()[0] && jugador.getPlayer().getPosicion()[1] == jugador.getFin()[1]){
                ctrl = "exit";
                System.out.println("FELICIDADES HAS GANADO!!!!");
            }else if(jugador.getPlayer().getPosicion() == minotauro.getPlayer().getPosicion()){
                System.out.println("pierde");
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            //inicio.print.accept(inicio.getPlano());
            inicio.printNiebla.accept(jugador.getPlayer().getPosicion());
        }
    }
}
