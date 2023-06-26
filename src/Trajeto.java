import java.io.Serializable;
import java.util.ArrayList;


public class Trajeto implements Comparable<Trajeto>, Serializable {
    // Atributos (Propriedades)
    private ArrayList<Aeroporto> rota;   // Lista de conexões que compoem o trajeto
    private double distanciaTotal;
   
    // Construtor
    public Trajeto(ArrayList<Aeroporto> rota) {
        this.rota = rota;
        this.distanciaTotal = calcularDistanciaTotal();
    }

    // Métodos

    // - Getters e Setters
    public double getDistanciaTotal() {
        return distanciaTotal;
    } 

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public ArrayList<Aeroporto> getRota() {
        return rota;
    }

    public void setRota(ArrayList<Aeroporto> rota) {
        this.rota = rota;
    }

    // - Funções da classe Trajeto

    public boolean adicionarAeroporto(Aeroporto aeroporto) {
        /* Adiciona um aeroporto à rota. */
        rota.add(aeroporto);
        atualizarDistancia();
        return true;
    }

    public boolean removerAeroporto(Aeroporto aeroporto) {
        /* Remove um aeroporto da rota. */
        if (rota.contains(aeroporto)) {
            rota.remove(aeroporto);
            atualizarDistancia();
            return true;
        }
        return false;
    }

    public int compareTo(Trajeto trajeto){

        if (this.getDistanciaTotal() < trajeto.getDistanciaTotal()){
            return -1;
        }
        if (this.getDistanciaTotal() > trajeto.getDistanciaTotal()){
            return 1;
        }
        return 0;
    }

    public String vizualizarTrajeto() {
        /* Retorna uma string com a rota do trajeto. */
        String lista = "";
        for (int i = 0; i < rota.size() - 1; i++){
            lista += (rota.get(i).getCidade()) + " " + (rota.get(i).getNome()) + " -> ";
        }
        lista += (rota.get(rota.size() - 1).getCidade()) + " " + (rota.get(rota.size() - 1).getNome()) + "\n";
        lista += "Distancia: " + Math.round(getDistanciaTotal())/1000 + " km\n";
        return lista;
    }

    public double calcularDistanciaTotal() {
        double distanciaTot = 0.0;
        for (int i = 0; i < rota.size() - 1; i++){
            distanciaTot += Coordenada.calcularDistancia(rota.get(i), rota.get(i + 1));
        }
        return distanciaTot;
    }

    public void atualizarDistancia() {
        setDistanciaTotal(calcularDistanciaTotal());
    }

    public Aeroporto getInicio() {
        //Devolve o aeroporto de inicio do trajeto.
        return rota.get(0);
    }
    
    public Aeroporto getFim() {
        //Devolve o aeroporto final do trajeto.
        return rota.get(rota.size() - 1);
    }

    @Override
    public String toString() {
        return vizualizarTrajeto();
    }
}
