package interfaz;
import dominio.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.*;
public class Interfaz{
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String> lista = new ArrayList<>();
	private String lenguaje = sc.next();
	LenguajeAB generarAB = new LenguajeAB();
	Lenguaje01 generar01 = new Lenguaje01();
	private Supplier<Stream<String>> generar = () -> {
		if(lenguaje.equalsIgnoreCase("ab")){
			int n = (int) Math.random() * 10;
			return Stream.iterate(generarAB.generar(n,"")).limit(20);
		}else if(lenguaje.equalsIgnoreCase("01")){
			return Stream.iterate(generar01.generar("")).limit(20);
		}
	};
	
	public ArrayList<String> procesarPeticion(){
		if(lenguaje.equalsIgnoreCase("01") || lenguaje.equalsIgnoreCase("ab")){
			lista = generar.get().collect(Collectors.toList());
		}else{
			System.out.println("introduce: AB o 01");
		}

		return lista;
	}
}
