import java.io.Serializable;
import java.util.ArrayList;

public class Voo implements Serializable {
    // Atributos (Propriedades)
    private static int registros = 100_000;
    private final int CODIGO;
    private Aviao aviao;
    private Aeroporto origem;
    private Aeroporto destino;
    private ArrayList<Passageiro> listaPassageiros;
    private ArrayList<Carga> listaCargas;

    // Construtor
    public Voo(Aviao aviao, Aeroporto origem, Aeroporto destino) {
        this.CODIGO = gerarCODIGO();
        this.aviao = aviao;
        this.origem = origem;
        this.destino = destino;
        this.listaPassageiros = new ArrayList<Passageiro>();
        this.listaCargas = new ArrayList<Carga>();
    }

    // - Getters e Setters
    public int getCODIGO() {
        return CODIGO;
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

    public int gerarCODIGO() {
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

    public Passageiro buscarPassageiro(String CPF) {
        //Encontra o passageiro dado o CPF, caso não haja, retorna null
        for (Passageiro a: listaPassageiros) 
            if (a.getCPF().equals(CPF))
                return a;
        return null;
    }

    public Carga buscarCarga(int ID) {
        //Encontra a carga dado o ID, caso não haja, retorna null
        for (Carga c: listaCargas) 
            if (c.getID() == ID)
                return c;
        return null;
    }

    public boolean adicionarPassageiro(Passageiro passageiro) {
        if (!listaPassageiros.contains(passageiro)) {
            listaPassageiros.add(passageiro);
            return true;
        }
        return false;
    }

    public boolean adicionarCarga(Carga carga) {
        if (!listaCargas.contains(carga)) {
            listaCargas.add(carga);
            return true;
        }
        return false;
    }

    public boolean removerPassageiro(Passageiro passageiro) {
        if (listaPassageiros.contains(passageiro)) {
            listaPassageiros.remove(passageiro);
            return true;
        }
        return false;
    }

    public boolean removerCarga(Carga carga) {
        if (!listaCargas.contains(carga)) {
            listaCargas.add(carga);
            return true;
        }
        return false;
    }


    // Criar os métodos de listar coisas
    
    @Override
    public String toString() {
        return "Código do vôo: " + this.CODIGO + "\n" +
               "Origem: " + this.origem.getCidade() + " - " + this.origem.getNome() + "\n" +
               "Destino: " + this.destino.getCidade() + " - " + this.destino.getNome() + "\n";
    }
}
