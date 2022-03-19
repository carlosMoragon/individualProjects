package dominio;

public class LenguajeAB{

	public String generar(int n, String palabra){

		//		S::= SaBB | J
		//			B ::= b

		if(n == 0){
			return palabra;
		}else{
			return generar(n - 1, "a" + palabra + "bb");
		}
	}


}
