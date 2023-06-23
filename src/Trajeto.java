import java.util.ArrayList;

public class Trajeto {
    // Atributos (Propriedades)
    private ArrayList<Voo> rota;   // Lista de conexões que compoem o trajeto
    private double distanciaTotal;
   
    // Construtor
    public Trajeto() {
        this.rota = new ArrayList<Voo>();
        this.distanciaTotal = calculaDistanciaTotal();
    }

    // Métodos

    // - Getters e Setters
    public double getDistanciaTotal() {
        return distanciaTotal;
    } 

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

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
        atualizaDistancia();
        return true;
    }

    public boolean removerRota(Voo voo) {
        /* Remove uma conexão da rota.
        Se  */
        if (rota.contains(voo)) {
            rota.remove(voo);
            atualizaDistancia();
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

    public double calculaDistanciaTotal() {
        double distanciaTot = 0.0;
        for (Voo voo : rota) {
            distanciaTot += Coordenada.calculaDistancia(voo.getOrigem(), voo.getDestino());
        }
        return distanciaTot;
    }

    public void atualizaDistancia() {
        setDistanciaTotal(calculaDistanciaTotal());
    }

    public Aeroporto getInicio() {
        //Devolve o aeroporto de inicio do trajeto.
        return rota.get(0).getOrigem();
    }
    
    public Aeroporto getFim() {
        //Devolve o aeroporto final do trajeto.
        return rota.get(rota.size() - 1).getDestino();
    }

    @Override
    public String toString() {
        return vizualizarTrajeto();
    }
}
