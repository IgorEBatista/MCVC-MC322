import java.io.Serializable;
import java.util.ArrayList;

public abstract class Cliente implements Serializable {
    
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

    public Passagem buscaPassagem(String ID) {
        //Encontra a pasagem referida.
        for (Passagem a: historicoDeCompras) 
            if (a.getID() == Integer.parseInt(ID))
                return a;
        return null;
    }

    public boolean adicionarPassagem(Passagem passagem) {
        historicoDeCompras.add(passagem);
        return true;
    }
    
    public boolean removerPassagem(Passagem passagem){
        return this.historicoDeCompras.remove(passagem);
    }
    
    public boolean removerPassagem(String ID){
        return removerPassagem(buscaPassagem(ID));        
    }

    public boolean remPassagem(int ID){
        return removerPassagem(buscaPassagem(String.valueOf(ID)));        

    }

    public String toString() {
        return "Nome: " + nome + 
            "\nTelefone: " + telefone + 
            "\nEmail: " + email + 
            "\nHistórico De Compras: " + historicoDeCompras;
    }
    
}