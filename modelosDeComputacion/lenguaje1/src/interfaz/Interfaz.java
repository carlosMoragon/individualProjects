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
	Stream.Builder<String> stBuilder = Stream.Builder();
	private Supplier<Stream<String>> generar = () -> {
		Stream<String> solucion = Stream<>();
		if(lenguaje.equalsIgnoreCase("ab")){
			for(int i = 0; i < 20; i++){
				int n = (int) Math.random() * 10;
				solucion += stBuilder.add(generarAB.generar(n, "")).build();
			//return Stream.iterate(generarAB.generar(n,"")).limit(20);
		}else if(lenguaje.equalsIgnoreCase("01")){
			solucion += stBuilder.add(generar01.generar("")).build();
			//return Stream.iterate(generar01.generar("")).limit(20);
		}
		return solucion;
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
