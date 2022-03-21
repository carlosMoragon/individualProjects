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
//		Stream<String> solucion =  stBuilder.add("").build();
		if(lenguaje.equalsIgnoreCase("ab")){
			for(int i = 0; i < 20; i++){
				int n = (int) Math.random() * 10;
				x.add(generarAB.generar(n, ""));
			}
			//return Stream.iterate(generarAB.generar(n,"")).limit(20);
		}else if(lenguaje.equalsIgnoreCase("01")){
			for(int i = 0; i< 20; i++){
				x.add(generar01.generar(""));
			//return Stream.iterate(generar01.generar("")).limit(20);
			}
		}
		//return solucion;
	};
	
	public List<String> procesarPeticion(){
		if(lenguaje.equalsIgnoreCase("01") || lenguaje.equalsIgnoreCase("ab")){
			generar.accept(lista);
			//lista = generar.get().collect(Collectors.toList());
		}else{
			System.out.println("introduce: AB o 01");
		}

		return lista;
	}
}
