public class Aeroporto {

    private String nome_aeroporto;
    private Coordenada coordenada_aeroporto;
    private Cidade cidade_aeroporto;
    private double larguraPistaPouso_aeroporto;
    
    public Aeroporto(String nome, Coordenada coordenada, Cidade cidade, double larguraPistaPouso){
        this.nome_aeroporto = nome;
        this.coordenada_aeroporto = coordenada;
        this.cidade_aeroporto = cidade;
        this.larguraPistaPouso_aeroporto = larguraPistaPouso;
    }

    public String getNome_aeroporto() {
        return nome_aeroporto;
    }

    public void setNome_aeroporto(String nome_aeroporto) {
        this.nome_aeroporto = nome_aeroporto;
    }

    public Coordenada getCoordenada_aeroporto() {
        return coordenada_aeroporto;
    }

    public void setCoordenada_aeroporto(Coordenada coordenada_aeroporto) {
        this.coordenada_aeroporto = coordenada_aeroporto;
    }

    public Cidade getCidade_aeroporto() {
        return cidade_aeroporto;
    }

    public void setCidade_aeroporto(Cidade cidade_aeroporto) {
        this.cidade_aeroporto = cidade_aeroporto;
    }

    public double getLarguraPistaPouso_aeroporto() {
        return larguraPistaPouso_aeroporto;
    }

    public void setLarguraPistaPouso_aeroporto(double larguraPistaPouso_aeroporto) {
        this.larguraPistaPouso_aeroporto = larguraPistaPouso_aeroporto;
    }

    public boolean aceitaPouso(Aviao aviao){

    }
    
    public String toString(){
        
    }
}
