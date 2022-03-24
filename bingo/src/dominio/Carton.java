package dominio;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Carton{

	private ArrayList<Integer> numeros = new ArrayList<>();
	int[][] carton = new int[3][5];
	
	Supplier<Integer> random = () -> (int) Math.random()*80;
	public int[][] generarCarton(){
		for(int i = 1; i<= 80; i++){
			numeros.add(i);
		}
		

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				carton[i][j] = numeros.get(random.get());
				numeros.remove(numeros.indexOf(carton[i][j]));
			}
		}
		return carton;
	}
	
	public String toString(){
		StringBuilder output = new StringBuilder();
		output.append("|");
		for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 5; j++){
				if(j == 4 && i != 2){
					output.append(carton[i][j] + "|");
					output.append("\n|");
				}else{
					output.append(carton[i][j] + "|");
				}
                        }
                }

		return output.toString();
	}
	

}
