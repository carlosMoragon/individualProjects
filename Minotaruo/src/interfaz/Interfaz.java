package interfaz;

import dominio.*;
import java.util.Scanner;

public class Interfaz {

    public void procesarLlamada(){
        Scanner sc = new Scanner(System.in);
        TratarMapa inicio = new TratarMapa();
        Mover control = new Mover();
        String[][] MAPA = inicio.inicializacion();

        control.reset.accept(MAPA, inicio.getDimensiones());
        inicio.print.accept(MAPA);

        String ctrl = "";
        while(!ctrl.equalsIgnoreCase("exit")){
            ctrl = sc.next();
            if("w".equals(ctrl)){
                System.out.println("entra en up");
                control.up.accept(MAPA);
            }else if("s".equals(ctrl)){
                control.down.accept(MAPA);
            }else if ("a".equals(ctrl)){
                control.left.accept(MAPA);
            }else if ("d".equals(ctrl)){
                control.right.accept(MAPA);
            }
            if(control.getPosicion()[0] == control.getFin()[0] && control.getPosicion()[1] == control.getFin()[1]){
                ctrl = "exit";
                System.out.println("FELICIDADES HAS GANADO!!!!");
            }
            inicio.print.accept(MAPA);
        }
    }
}
