public class Aeroporto {

    private String nome;
    private Coordenada coordenada;
    private Cidade cidade;
    private double larguraPistaPouso;
    
    public Aeroporto(String nome, Coordenada coordenada, Cidade cidade, double larguraPistaPouso){
        this.nome = nome;
        this.coordenada = coordenada;
        this.cidade = cidade;
        this.larguraPistaPouso = larguraPistaPouso;
    }
    //Gets e Sets
    public String toString(){
        String saida = "";
        saida += "Nome: " + nome + "\nCoordenadas: " + coordenada + "\nCidade: " + cidade.getNome() + "\nLargura Pista: " + larguraPistaPouso;
        return saida;
    }
    public boolean aceitaPouso(Aviao aviao){

        if (aviao.getEnvergadura() <= larguraPistaPouso){
            return true;
        }
        return false;
    }
    
    public String getNome() {
        return nome;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade_aeroporto) {
        this.cidade = cidade_aeroporto;
    }

    public double getLarguraPistaPouso() {
        return larguraPistaPouso;
    }

    public void setLarguraPistaPouso(double larguraPistaPouso_aeroporto) {
        this.larguraPistaPouso = larguraPistaPouso_aeroporto;
    }
}