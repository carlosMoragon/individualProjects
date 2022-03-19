package dominio;
import java.util.Random;
import java.util.function.Supplier;

public class Lenguaje01{
	/* L= {0,1}*| n0(x) = n1(x)
	 * S::= SA1 | lambda
	 * A0::= 0A
	 * A1 ::= 1A
	 * A ::= 0
	*/
	public String generar(String palabra){
		Random rd = new Random();
		
		 Supplier<Boolean> aleatorio = () -> rd.nextBoolean();
                        /*int i = (int) Math.random()*3;
                        if(i % 2 == 0){
                                return true;
                        }else{
                                return false;
                        }*/
		
		if(aleatorio.get()){
			palabra = palabra + "A1";
			if(palabra.contains("A0") && aleatorio.get()){
				return generar(palabra.replace("A0","0A"));
			}else if(palabra.contains("A1") && aleatorio.get()){
				return generar(palabra.replace("A1", "1A"));
			}else{
				return generar(palabra);
			}
		}else{
			return palabra.replace("A", "0");
		}


	}
}
