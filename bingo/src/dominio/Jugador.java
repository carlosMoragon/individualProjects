package dominio;

public class Jugador{
	Carton carton;
	String marca = "█";

	public void setCarton(Carton carton){
		this.carton = carton;
	}
	
	public String[][] marcar(int i, int j){
		carton.carton[i][j] = "█";
		return carton.carton;	
	}
}
