
public class Conexao implements Comparable {
    private double distancia_conexao;
    private Aeroporto aeroportoA_conexao;
    private Aeroporto aeroportoB_conexao;

    public Conexao(double distancia, Aeroporto aeroportoA, Aeroporto aeroportoB) {
        this.distancia_conexao = distancia;
        this.aeroportoA_conexao = aeroportoA;
        this.aeroportoB_conexao = aeroportoB;
    }
    
    public String toString(){
        String saida = "";
        saida += "Conexão de "  + aeroportoA_conexao.getNome() + " a " + aeroportoB_conexao.getNome() + 
        "\nDistância: " + distancia_conexao + "\n"; 
        return saida;
    
    }
    //Gets e Sets
    public double getDistancia_conexao() {
        return distancia_conexao;
    }

    public void setDistancia_conexao(double distancia_conexao) {
        this.distancia_conexao = distancia_conexao;
    }

    public Aeroporto getAeroportoA_conexao() {
        return aeroportoA_conexao;
    }

    public void setAeroportoA_conexao(Aeroporto aeroportoA_conexao) {
        this.aeroportoA_conexao = aeroportoA_conexao;
    }

    public Aeroporto getAeroportoB_conexao() {
        return aeroportoB_conexao;
    }

    public void setAeroportoB_conexao(Aeroporto aeroportoB_conexao) {
        this.aeroportoB_conexao = aeroportoB_conexao;
    }

    //Outros metodos
}
