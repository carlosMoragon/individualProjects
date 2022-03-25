package interfaz;

import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz{
	public String procesarPeticion(){
		Carton carton = new Carton();
		Bolas bolas = new Bolas();
		Jugador jugador = new Jugador();

		bolas.setNumeros(carton.getNumeros());

		carton.generarCarton();
		
		jugador.setCarton(carton);
		//System.out.println(carton);
		

		return "";
	}

}
