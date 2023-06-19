import java.util.ArrayList;

public class Cidade {
    private String nome;
    private String pais;
    private ArrayList<Aeroporto> listaAeroportos_cidade;

  public Cidade(String nome, String pais, ArrayList<Aeroporto> listaAeroportos){
        this.nome = nome;
        this.pais = pais;
        this.listaAeroportos_cidade = listaAeroportos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome_cidade) {
        this.nome = nome_cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais_cidade) {
        this.pais = pais_cidade;
    }

    public ArrayList<Aeroporto> getListaAeroportos_cidade() {
        return listaAeroportos_cidade;
    }

    public void setListaAeroportos_cidade(ArrayList<Aeroporto> listaAeroportos_cidade) {
        this.listaAeroportos_cidade = listaAeroportos_cidade;
    }


    //Outros métodos
    public boolean adicionarAeroporto(Aeroporto aeroporto){
        //TODO Implementar metodo
        return false;
    }

    public boolean removerAeroporto(Aeroporto aeroporto){
        //TODO implementar metodo
        return false;
    } 

    public String toString(){
        //TODO implementar metodo
        return null;
        
    }

}