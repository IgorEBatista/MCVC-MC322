public class ClientePJ extends Cliente{

    private final String CNPJ;

    // Construtor
    public ClientePJ(String nome, String telefone, String email, String CNPJ) {
        super(nome, telefone, email);
        this.CNPJ = CNPJ;
    }

    //Gets e Sets
    public String getCNPJ() {
        return CNPJ;
    }
    
    public String toString() {
        return super.toString() +
            "\nCNPJ: " + CNPJ + "\n";
    }

}