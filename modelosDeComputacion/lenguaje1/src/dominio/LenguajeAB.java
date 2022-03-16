package dominio;

public class LenguajeAB extends Gramatica{
	//El lenguaje: L= { a^n b^m | 10 >= a >= 0, m  = 2n}
	
	@Override
	public String generar(/*int n, */String palabra){
		/*
		S::= SaBB | J
		B ::= b
		
		if(n == 0){
			return palabra;
		}else{
			return generar(n - 1, "a" + palabra + "bb");
		}*/
		return "";
	}


}
