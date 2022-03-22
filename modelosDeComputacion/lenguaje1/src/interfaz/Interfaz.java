package interfaz;
import dominio.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.*;
import java.util.stream.Stream;
public class Interfaz{
	private Scanner sc = new Scanner(System.in);

	private List<String> lista = new ArrayList<>();
	
	private String lenguaje = sc.next();

	LenguajeAB generarAB = new LenguajeAB();
	Lenguaje01 generar01 = new Lenguaje01();

	Stream.Builder<String> stBuilder = Stream.builder(); 
	private Consumer<List<String>> generar = x -> {
		if(lenguaje.equalsIgnoreCase("ab")){
			for(int i = 0; i < 10; i++){
				x.add(generarAB.generar(i , ""));
			}
		}else if(lenguaje.equalsIgnoreCase("01")){
			for(int i = 0; i< 10; i++){
				x.add(generar01.generar(""));
			}
		}
	};
	
	public List<String> procesarPeticion(){
		if(lenguaje.equalsIgnoreCase("01") || lenguaje.equalsIgnoreCase("ab")){
			generar.accept(lista);
			List<String> sinRepes = lista
				.stream()
				.distinct()
				.collect(Collectors.toList());
			return sinRepes;
		}else{
			System.out.println("introduce: AB o 01");
			return lista;
		}
	}
}
