package dominio;

public class Players {
    private String player;
    private int[] posicion;

    public Players(String player, int[] posicion){
        this.player = player;
        this.posicion = posicion;
    }
    public String getPlayer(){
        return player;
    }

    public void setPlayer(String player){
        this.player = player;
    }

    public int[] getPosicion() {return posicion;}

    public void setPosicionRandom(int[] dimensiones) {
        while(posicion[0] == 0 || posicion[0] == dimensiones[0]-1){
            posicion[0] = (int) (Math.random()*dimensiones[0]);
        }
        while(posicion[1] == 0 || posicion[1] == dimensiones[1]-1){
            posicion[1] = (int) (Math.random()*dimensiones[1]);
        }

    }

    public void setPosicion(int[] posicion){
        this.posicion = posicion;
    }
    public String toString(){
        return player;
    }
}
