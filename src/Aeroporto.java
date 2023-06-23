import java.util.ArrayList;

public class Aeroporto {

    private String nome;
    private Coordenada coordenada;
    private String cidade;
    private double larguraPistaPouso;
    private ArrayList<Voo> listaVoos;
    
    public Aeroporto(String nome, Coordenada coordenada, String cidade, double larguraPistaPouso){
        this.nome = nome;
        this.coordenada = coordenada;
        this.cidade = cidade;
        this.larguraPistaPouso = larguraPistaPouso;
        this.listaVoos = new ArrayList<Voo>();
    }
    //Gets e Sets
    public String toString(){
        String saida = "";
        saida += "Nome: " + nome + "\nCoordenadas: " + coordenada + "\nCidade: " + cidade + "\nLargura Pista: " + larguraPistaPouso;
        return saida;
    }
    public boolean aceitaPouso(Aviao aviao){
        /* Verifica se o aeroporto aceita pouso de acordo com a envergadura e a largura da pista */
        if (aviao.getEnvergadura() <= larguraPistaPouso){
            return true;
        }
        return false;
    }
    public boolean cadastrarVoo (Aeroporto destino, Aviao aviao){
        //Utilizado quando o voo é cadastrado/gerado, ou seja, no aeroporto de origem.
        Voo novo = new Voo(aviao, this, destino);
        if (!listaVoos.contains(novo)){
            return listaVoos.add(novo) && destino.cadastrarVoo(novo);
        }
        return false;
    }

    public boolean cadastrarVoo (Voo novoVoo){
        //Utilizado quando o voo já criado pelo aeroporto de origem é cadastrado no destino.
                if (!listaVoos.contains(novoVoo)){
            return listaVoos.add(novoVoo);
        }
        return false;
    }

    public ArrayList<Voo> getListaVoos() {
        return listaVoos;
    }
    
    public String getNome() {
        return nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome(String nome_aeroporto) {
        this.nome = nome_aeroporto;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenada coordenada_aeroporto) {
        this.coordenada = coordenada_aeroporto;
    }

    public double getLarguraPistaPouso() {
        return larguraPistaPouso;
    }

    public void setLarguraPistaPouso(double larguraPistaPouso_aeroporto) {
        this.larguraPistaPouso = larguraPistaPouso_aeroporto;
    }
}