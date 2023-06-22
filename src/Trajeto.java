import java.util.ArrayList;

public class Trajeto {
    // Atributos (Propriedades)
    private ArrayList<Conexao> rota;   // Lista de conexões que compoem o trajeto
    private Aeroporto origem;
    private Aeroporto destino;


    // Construtor
    public Trajeto() {
        this.rota = new ArrayList<Conexao>();
    }

    // Métodos

    // - Getters e Setters

    public ArrayList<Conexao> getRota() {
        return rota;
    }

    public void setRota(ArrayList<Conexao> rota) {
        this.rota = rota;
    }

    // - Funções da classe Trajeto

    public boolean adicionarConexao(Conexao conexao) {
        /* Adiciona uma conexão à rota. */
        rota.add(conexao);
        return true;
    }

    public boolean removerConexao(Conexao conexao) {
        /* Remove uma conexão da rota. */
        if (rota.contains(conexao)) {
            rota.remove(conexao);
            return true;
        }
        return false;
    }

    public String vizualizarTrajeto() {
        /* Retorna uma string com a rota do trajeto. */
        String lista = "Trajeto:\n";
        for (Conexao c : rota) {
            lista += (c.getAeroportoA()).getNome() + " -> " + (c.getAeroportoB()).getNome() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return vizualizarTrajeto();
    }
}
