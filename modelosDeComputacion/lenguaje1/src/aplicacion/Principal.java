package aplicacion;
import interfaz.*;
public class Principal{
	public static void main(String[] args){
		System.out.println("------------------------------------------------");
		Interfaz llamar = new Interfaz();
		System.out.println(llamar.procesarPeticion());
		
	}
}
