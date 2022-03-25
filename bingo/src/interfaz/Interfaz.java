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

		bolas.setNumeros(carton.getNumeros());

		carton.generarCarton();
		
		jugador.setCarton(carton);
		//System.out.println(carton);
		
		Consumer<Object> print = System.out::println;

		print.accept("Hola jugador, buena suerte con el Bingo.\nEste es tu carton:\n" + carton);
		print.accept("\n\n¡Que comienze el BINGO!");
		bolas.generarBolas();	
	}

}
