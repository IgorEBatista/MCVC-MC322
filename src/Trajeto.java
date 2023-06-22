import java.util.ArrayList;

public class Trajeto {
    // Atributos (Propriedades)
    private ArrayList<Voo> rota;   // Lista de conexões que compoem o trajeto
    private double distanciaTotal;
    
    // Construtor
    public Trajeto() {
        this.rota = new ArrayList<Voo>();
        this.distanciaTotal = getDistanciaTotal();
    }

    // Métodos
    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    // - Getters e Setters

    public ArrayList<Voo> getRota() {
        return rota;
    }

    public void setRota(ArrayList<Voo> rota) {
        this.rota = rota;
    }

    // - Funções da classe Trajeto

    public boolean adicionarRota(Voo voo) {
        /* Adiciona uma conexão à rota. */
        rota.add(voo);
        return true;
    }

    public boolean removerRota(Voo voo) {
        /* Remove uma conexão da rota.
        Se  */
        if (rota.contains(voo)) {
            rota.remove(voo);
            return true;
        }
        return false;
    }

    public String vizualizarTrajeto() {
        /* Retorna uma string com a rota do trajeto. */
        String lista = "Trajeto:\n";
        for (Voo v : rota) {
            lista += (v.getOrigem()).getNome() + " -> " + (v.getDestino()).getNome() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return vizualizarTrajeto();
    }
}
