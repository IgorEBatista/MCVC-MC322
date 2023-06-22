import java.util.ArrayList;

public class Cidade {
    // Atributos (Propriedades)
    private String nome;
    private String pais;
    private ArrayList<Aeroporto> listaAeroportos;


    // Construtor
    public Cidade(String nome, String pais, ArrayList<Aeroporto> listaAeroportos){
        this.nome = nome;
        this.pais = pais;
        this.listaAeroportos = listaAeroportos;
    }


    // Métodos

    // - Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Aeroporto> getListaAeroportos() {
        return listaAeroportos;
    }

    public void setListaAeroportos_cidade(ArrayList<Aeroporto> listaAeroportos) {
        this.listaAeroportos = listaAeroportos;
    }


    // - Funções da classe Trajeto
    
    public boolean adicionarAeroporto(Aeroporto aeroporto){
        /* Adiciona, na lista de aeroportos, o aeroporto dado como parâmetro.
        Se já estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (!listaAeroportos.contains(aeroporto)) {
            listaAeroportos.add(aeroporto);
            return true;
        }
        return false;
    }

    public boolean removerAeroporto(Aeroporto aeroporto){
        /* Remove, da lista de aeroportos, o aeroporto dado como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaAeroportos.contains(aeroporto)) {
            listaAeroportos.remove(aeroporto);
            return true;
        }
        return false;
    }

    public Aeroporto buscarAeroporto(String nome) {
        /* Busca, na lista de aeroportos, o aeroporto que tem o nome
        dado como parâmetro.
        Retorna o aeroporto se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Aeroporto a : listaAeroportos) 
            if (a.getNome().equals(nome))
                return a;
        return null;
    }

    public String listarAeroporto() {
        /* Retorna uma string com os aeroportos da cidade. */
        if (listaAeroportos.size() == 0)
            return this.getNome() + " não possui aeroportos.\n";
        String lista = "--------------------------------------------------\n" +
                       "Aeroportos em " + this.getNome() + " :\n" +
                       "--------------------------------------------------\n";
        for (Aeroporto a : listaAeroportos)
            lista += a.toString() + "------------------------------\n";
        return lista;
    }

    public String toString(){
        return "Nome: " + this.nome + "\n" + 
               "País: " + this.pais + "\n";   
    }
}