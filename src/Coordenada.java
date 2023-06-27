import java.io.Serializable;
import java.lang.Math;

public class Coordenada implements Serializable {
    private double latitude;
    private double longitude;

    public Coordenada(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
   
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static double calcularDistancia(Coordenada coordenada1, Coordenada coordenada2){
        double grau = 111319.5; // 1 grau equivale a aproximadamente essa distância no equador, tanto em termos de latitude quanto longitude.
        double dif_lat = Math.abs(coordenada1.getLatitude() - coordenada2.getLatitude());
        double med_lat = Math.abs(coordenada1.getLatitude() + coordenada2.getLatitude())/2;
        double dif_lon = Math.abs(coordenada1.getLongitude() - coordenada2.getLongitude());
        double dist_lat, dist_long;

        dist_lat = dif_lat * grau;
        dist_long = dif_lon * grau * Math.cos(Math.toRadians(med_lat)); // Devido a mudança no comprimento dos paralelos, é necessário corrigir pela longitude.
        
        return Math.sqrt(Math.pow(dist_lat, 2) + Math.pow(dist_long, 2));
    }

    public static double calcularDistancia(Aeroporto aeroporto1, Aeroporto aeroporto2){
        return calcularDistancia(aeroporto1.getCoordenada(), aeroporto2.getCoordenada());
    }

    public String toString() {
        return "Latitude: " + latitude + 
            "\nLongitude: " + longitude;
    }

}
