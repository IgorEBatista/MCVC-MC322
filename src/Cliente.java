import java.util.ArrayList;

public abstract class Cliente {
    
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Passagem> historicoDeCompras;
    
    //Construtor
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.historicoDeCompras = new ArrayList<Passagem>();
    }
    
    //Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Passagem> getHistoricoDeCompras() {
        return historicoDeCompras;
    }

    public void setHistoricoDeCompras(ArrayList<Passagem> historicoDeCompras) {
        this.historicoDeCompras = historicoDeCompras;
    }

    //Outros metodos

    public boolean addPassagem(Passagem passagem) {
        //TODO implementar método
        throw new UnsupportedOperationException("Unimplemented method 'remPassagem'");
    }
    
    public boolean remPassagem(Passagem passagem){
        //TODO implementar método
        throw new UnsupportedOperationException("Unimplemented method 'remPassagem'");
    }
}