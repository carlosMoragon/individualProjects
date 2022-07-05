package dominio;

import java.util.Scanner;
import java.lang.NullPointerException;
import java.util.function.Consumer;

public class Jugador{
	String[][] carton;
	String marca = "█";
	int[] coordenadas = new int[2];
	boolean marcar2 = true;
	Scanner sc = new Scanner(System.in);
	
	public void setCarton(Carton carton){
		this.carton = carton.carton;
	}

	public Consumer<String[][]> marcar = x -> {
		System.out.println(carton + "\n------------------");

		System.out.println("introduce la fila");
		coordenadas[0] = sc.nextInt();
		//int i = sc.nextInt();
		System.out.println("introduce la columna");
		coordenadas[1] = sc.nextInt();
		//int j = sc.nextInt();
		if(coordenadas[0] < 3 && coordenadas[1] < 5) carton[coordenadas[0][coordenadas[1]] = "█";
		//carton[i][j] = "█";
		/*System.out.println("¿Desea marcar otro? - n ó y -");
		String marcarVarios = sc.next();

		if(marcarVarios.equalsIgnoreCase("y")){
			marcar2 = true;
		}else if(marcarVarios.equalsIgnoreCase("n")){
			marcar2 = false;
		}else{
			System.out.println("No te hemos entendido, se sigue la ronda");
			marcar2 = false;
		}
	}else if(tachar.equalsIgnoreCase("n")){
		System.out.println("Seguimos con el siguiente número");
		marcar2 = false;
	}else{
		System.out.println("No te entiendo repite porfavor");
		marcar2 = true;
	}*/
};
	public String[][] marcar(){
		System.out.println("¿Quieres tachar alguno? - n ó y -");
		String tachar = sc.next();
		while(marcar2){
		if(tachar.equalsIgnoreCase("y")){
			System.out.println(carton + "\n------------------");

			System.out.println("introduce la fila");
			int i = sc.nextInt();
			System.out.println("introduce la columna");
			int j = sc.nextInt();
			carton[i][j] = "█";
			System.out.println("¿Desea marcar otro? - n ó y -");
			String marcarVarios = sc.next();

			if(marcarVarios.equalsIgnoreCase("y")){
				marcar2 = true;
			}else if(marcarVarios.equalsIgnoreCase("n")){
				marcar2 = false;
			}else{
				System.out.println("No te hemos entendido, se sigue la ronda");
				marcar2 = false;
			}
		}else if(tachar.equalsIgnoreCase("n")){
			System.out.println("Seguimos con el siguiente número");
			marcar2 = false;
		}else{
			System.out.println("No te entiendo repite porfavor");
			marcar2 = true;
		}
		}
		return carton;	
	}
}
