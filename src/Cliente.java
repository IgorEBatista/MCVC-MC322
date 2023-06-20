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

    public Passagem buscaPassagem(String ID) {
        //Encontra a pasagem referida.
        for (Passagem a: historicoDeCompras) 
            if (a.getID() == Integer.parseInt(ID))
                return a;
        return null;
    }

    public boolean addPassagem(Passagem passagem) {
        return this.historicoDeCompras.add(passagem);
    }
    
    public boolean remPassagem(Passagem passagem){
        return this.historicoDeCompras.remove(passagem);
    }
    
    public boolean remPassagem(String ID){
        return remPassagem(buscaPassagem(ID));        
    }

    public boolean remPassagem(int ID){
        return remPassagem(buscaPassagem(String.valueOf(ID)));        

    }

}