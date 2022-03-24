package aplicacion;
import dominio.*;

public class Principal{
	public static void main(String[] args){
		System.out.println("------------------------------------");
		Carton carton = new Carton();
		carton.generarCarton();
		System.out.println(carton);
	}
}
