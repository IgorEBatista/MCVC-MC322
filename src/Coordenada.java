public class Coordenada {
    private int latitude_coordenada;
    private int longitude_coordenada;

    public Coordenada(int latitudo, int longitude){
        this.latitude_coordenada = latitudo;
        this.longitude_coordenada = longitude;
    }
   
    public int getLatitude_coordenada() {
        return latitude_coordenada;
    }

    public void setLatitude_coordenada(int latitude_coordenada) {
        this.latitude_coordenada = latitude_coordenada;
    }

    public int getLongitude_coordenada() {
        return longitude_coordenada;
    }

    public void setLongitude_coordenada(int longitude_coordenada) {
        this.longitude_coordenada = longitude_coordenada;
    }

    public static double calculaDistancia(Coordenada coordenada1, Coordenada coordenada2){

    }

    public static double calculaDistancia(Aeroporto aeroporto1, Aeroporto aeroporto2){

    }

    public String toString(){

    }
}
