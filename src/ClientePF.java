import java.util.Calendar;

public class ClientePF extends Cliente{
    
    private final String CPF;
    private Calendar dataNascimento;
    
    //Construtor
    public ClientePF(String nome, String telefone, String email, String CPF, Calendar dataNascimento) {
        super(nome, telefone, email);
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }
    
    //Sets e gets
    public String getCPF() {
        return CPF;
    }
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Outros métodos
    public String toString() {
        return super.toString() + 
            "\nCPF: " + CPF + 
            "\nData de Nascimento: " + dataNascimento;
    }

}
