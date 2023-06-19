import java.util.ArrayList;

public class Trajeto {
    // Atributos (Propriedades)
    private ArrayList<Aeroporto> rota;   // Lista de aeroportos que compoem o trajeto
    private ArrayList<Voo> listaVoos;    // Lista de voos que compõem a viagem


    // Construtor
    public Trajeto(ArrayList<Aeroporto> rota) {
        this.rota = rota;
        this.listaVoos = new ArrayList<Voo>();
    }

    // Métodos

    // - Getters e Setters

    public ArrayList<Aeroporto> getRota() {
        return rota;
    }

    public ArrayList<Voo> getListaVoos() {
        return listaVoos;
    }

    // - Funções da classe Trajeto

    public boolean adicionarVoo(Voo voo) {
        /* Adiciona um voo ao trajeto.
        Se há N aeroportos no trajeto, deve haver N-1 voos.
        O trajeto pode ser usado por uma companhia para fazer as combinações de caminhos
        entre uma cidade A e B.
        Mas só faz sentido adicionar voos ao trajeto quando estamos criando uma passagem. */
        if (listaVoos.size() == 0) {
            listaVoos.add(voo);
            return true;
        }
        if (listaVoos.size() == rota.size() - 1) {
            return false;   // Não é possível adicionar mais voos
        }
        return true;
        // Pensar em uma maneira de colocar todos os voos em ordem
        // TODO: Terminar a implementação
    }

    public boolean atualizarVoo(Voo antigo, Voo novo) {
        /* Substitui um voo do trajeto. */
        // TODO: Implementar
        return false;

    }

    public Voo buscarVoo(int codigo) {
        /* Busca, na lista de voos, o voo que tem o código
        dado como parâmetro.
        Retorna o voo se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Voo v : listaVoos) 
            if (v.getCodigo() == codigo)
                return v;
        return null;
    }

    public String vizualizarTrajeto() {
        /* Retorna uma string com a rota e os voos do trajeto. */
        String lista = "";
        for (Voo v : listaVoos) {
            lista += (v.getOrigem()).getCidade() + " -> " + (v.getDestino()).getCidade() + 
                     ": Vôo " + v.getCodigo() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Trajeto:\n" + vizualizarTrajeto();
    }
}
