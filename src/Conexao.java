
public class Conexao{
    private double distancia;
    private Aeroporto aeroportoA;
    private Aeroporto aeroportoB;

    public Conexao(double distancia, Aeroporto aeroportoA, Aeroporto aeroportoB) {
        this.distancia = distancia;
        this.aeroportoA = aeroportoA;
        this.aeroportoB = aeroportoB;
    }
    
    public String toString(){
        String saida = "";
        saida += "Conexão de "  + aeroportoA.getNome() + " a " + aeroportoB.getNome() + 
        "\nDistância: " + distancia + "\n"; 
        return saida;
    
    }
    //Gets e Sets
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Aeroporto getAeroportoA() {
        return aeroportoA;
    }

    public void setAeroportoA(Aeroporto aeroportoA) {
        this.aeroportoA = aeroportoA;
    }

    public Aeroporto getAeroportoB() {
        return aeroportoB;
    }

    public void setAeroportoB(Aeroporto aeroportoB) {
        this.aeroportoB = aeroportoB;
    }

    //Outros metodos
}
