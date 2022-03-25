package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Bolas{
	ArrayList<Integer> numeros = new ArrayList<>();
	ArrayList<Integer> historial = new ArrayList<>();

	public void setNumeros(ArrayList<Integer> numeros){
		this.numeros = numeros;
	}

	public void generarBolas(){
		int posicion = 0;
		for(Integer i: numeros){
			posicion = (int)(Math.random() * (numeros.size() - 1));
			System.out.println("El: " + numeros.get(posicion));
			//meter metodo que interactue con el jugador para que marque el numero si lo tiene
			historial.add(numeros.get(posicion));
			numeros.remove(posicion);
		}
	}
}
