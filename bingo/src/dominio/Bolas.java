package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Bolas{
	ArrayList<Integer> numeros = new ArrayList<>();
	ArrayList<Integer> historial = new ArrayList<>();
	Jugador player1 = new Jugador();

	public void setNumeros(ArrayList<Integer> numeros){
		this.numeros = numeros;
	}

	public void generarBolas(){
		int posicion = 0;
		for(Integer i: numeros){
			posicion = (int)(Math.random() * (numeros.size() - 1));
			System.out.println("El: " + numeros.get(posicion));
			player1.marcar();
			//meter metodo que interactue con el jugador para que marque el numero si lo tiene
			historial.add(numeros.get(posicion));
			numeros.remove(posicion);
		}
	}


}
