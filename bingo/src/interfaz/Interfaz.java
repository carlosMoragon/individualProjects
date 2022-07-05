package interfaz;

import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;
public class Interfaz{
	public void procesarPeticion(){
		Carton carton = new Carton();
		Bolas bolas = new Bolas();
		Jugador jugador = new Jugador();
		Scanner sc = new Scanner(System.in);

		bolas.setNumeros(carton.getNumeros());

		carton.generarCarton();
		
		jugador.setCarton(carton);
		//System.out.println(carton);

		System.out.println("Hola jugador, buena suerte con el Bingo.\nEste es tu carton:\n" + carton);
		System.out.println("\n\n¡Que comienze el BINGO!");
		bolas.generarBolas();
		System.out.println("¿Deseas marcar algun numero?");
		String respuesta = sc.next();
		if (sc.equalsIgnoreCase("y")){
			jugador.marcar.accept(carton.getCarton());
		}else{
			System.out.println();
		}
	}

}
