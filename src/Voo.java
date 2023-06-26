import java.io.Serializable;
import java.util.ArrayList;

public class Voo implements Serializable {
    // Atributos (Propriedades)
    private static int registros = 100_000;
    private final int codigo;
    private Aviao aviao;
    private Aeroporto origem;
    private Aeroporto destino;
    private ArrayList<Passageiro> listaPassageiros;
    private ArrayList<Carga> listaCargas;

    // Construtor
    public Voo(Aviao aviao, Aeroporto origem, Aeroporto destino) {
        this.codigo = gerarCodigo();
        this.aviao = aviao;
        this.origem = origem;
        this.destino = destino;
        this.listaPassageiros = new ArrayList<Passageiro>();
        this.listaCargas = new ArrayList<Carga>();
    }

    // - Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }
    
    public ArrayList<Passageiro> getListaPassageiros() {
        return listaPassageiros;
    }

    public void setListaPassageiros(ArrayList<Passageiro> listaPassageiros) {
        this.listaPassageiros = listaPassageiros;
    }

    public ArrayList<Carga> getListaCargas() {
        return listaCargas;
    }

    public void setListaCargas(ArrayList<Carga> listaCargas) {
        this.listaCargas = listaCargas;
    }

    // - Funções da classe Voo

    public int gerarCodigo() {
        /* Gera um número a partir do atributo de classe 'registros'.
        o código gerado tem, pelo menos, 6 dígitos. */
        registros++;
        return registros;
    }

    public double calcularFaturamento() {
        /* Calcula o faturamento total do voo, ou seja,
        a soma dos preços de cada passagem. */
        double faturamento = 0;
        for (Passageiro p : listaPassageiros) {
            double preco = p.getPassagem().getPreco();
            faturamento += preco;
        }
        return faturamento;
    }

    public Passageiro buscaPassageiro(String CPF) {
        //Encontra o passageiro dado o CPF, caso não haja, retorna null
        for (Passageiro a: listaPassageiros) 
            if (a.getCPF().equals(CPF))
                return a;
        return null;
    }

    // Criar os métodos de listar coisas
    
    @Override
    public String toString() {
        return "Código do vôo: " + this.codigo + "\n" +
               "Origem: " + this.origem.getCidade() + " - " + this.origem.getNome() + "\n" +
               "Destino: " + this.destino.getCidade() + " - " + this.destino.getNome() + "\n";
    }
}
