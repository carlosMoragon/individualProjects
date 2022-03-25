package dominio;

import java.util.Scanner;

public class Jugador{
	Carton carton;
	String marca = "█";
	Scanner sc = new Scanner();

	public void setCarton(Carton carton){
		this.carton = carton;
	}
	
	public String[][] marcar(){
		System.out.println("¿Quieres tachar alguno?");
		String tachar = sc.next();
		if(tachar.equalsIgnoreCase("y")){

		}else if(tachar.equalsIgnoreCase("n")){
		}else{
			System.out.println("No te entiendo repite porfavor");
		}
		carton.carton[i][j] = "█";
		return carton.carton;	
	}
}
