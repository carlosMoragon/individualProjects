package aplicacion;
import interfaz.*;
public class Principal{
	public static void main(String[] args){
		/*LenguajeAB numeroDeA = new LenguajeAB();
		Gramatica palabra01 = new Lenguaje01();

		System.out.println(numeroDeA.generar(/*Integer.parseInt(args[0]), ""));
		System.out.println(palabra01.generar(""));*/
		Interfaz llamar = new Interfaz();
		System.out.println(llamar.procesarPeticion());
		
	}
}
