import java.util.ArrayList;

public class Cidade {
    private String nome_cidade;
    private String pais_cidade;
    private ArrayList<Aeroporto> listaAeroportos_cidade;

  public Cidade(String nome, String pais, ArrayList<Aeroporto> listaAeroportos){
        this.nome_cidade = nome;
        this.pais_cidade = pais;
        this.listaAeroportos_cidade = listaAeroportos;
    }

    public String getNome_cidade() {
        return nome_cidade;
    }

    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    public String getPais_cidade() {
        return pais_cidade;
    }

    public void setPais_cidade(String pais_cidade) {
        this.pais_cidade = pais_cidade;
    }

    public ArrayList<Aeroporto> getListaAeroportos_cidade() {
        return listaAeroportos_cidade;
    }

    public void setListaAeroportos_cidade(ArrayList<Aeroporto> listaAeroportos_cidade) {
        this.listaAeroportos_cidade = listaAeroportos_cidade;
    }

    public boolean adicionarAeroporto(Aeroporto aeroporto){

    }

    public boolean removerAeroporto(Aeroporto aeroporto){

    } 

    public String toString(){
        
    }

}