import java.io.Serializable;
import java.util.ArrayList;

public class Aeroporto implements Serializable {

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
        saida += "Nome: " + nome + "\nCoordenadas: " + coordenada + "\nCidade: " + cidade + "\nLargura Pista: " + larguraPistaPouso + "\n";
        return saida;
    }
    public boolean aceitaPouso(Aviao aviao){
        /* Verifica se o aeroporto aceita pouso de acordo com a envergadura e a largura da pista */
        if (aviao.getEnvergadura() <= larguraPistaPouso){
            return true;
        }
        return false;
    }
    public boolean adicionarVoo (Aeroporto destino, Aviao aviao){
        
        Voo ida = new Voo(aviao, this, destino);
        Voo volta = new Voo (aviao, destino, this);
        if (!listaVoos.contains(ida) && !destino.getListaVoos().contains(volta)){
            destino.getListaVoos().add(volta);
            return listaVoos.add(ida);
        }
        return false;
    }

    public boolean removerVoo(Voo voo) {
        /* Remove, da lista de voos, o voo dado como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaVoos.contains(voo)) {
            listaVoos.remove(voo);
            return true;
        }
        return false;
    }

    public Voo buscarVoo(int codigo) {
        /* Busca, na lista de voos, o voo que tem o número de série
        dado como parâmetro.
        Retorna o voo se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Voo v: listaVoos) 
            if (v.getCodigo() == codigo)
                return v;
        return null;
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