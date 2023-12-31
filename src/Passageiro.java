import java.io.Serializable;

public class Passageiro implements Serializable {
    
    public static final double pesoMEDIO = 70.0; //média de peso 70 kg
    private final String  CPF;
    private String nome;
    private String telefoneEmergencia;
    private Passagem passagem;
    private double pesoBagagem;
    
    //Construtor

    public Passageiro(String CPF, String nome, String telefoneEmergencia, Passagem passagem, double pesoBagagem) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefoneEmergencia = telefoneEmergencia;
        this.passagem = passagem;
        this.pesoBagagem = pesoBagagem;
    }
    
    
    //Sets e Gets

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public double getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(double pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    //Outros métodos

    public String toString() {
        return "CPF: " + CPF + 
            "\nNome: " + nome + 
            "\nTelefone de Emergência: " + telefoneEmergencia +
            "\nID da Passagem: " + passagem.getID() +
            "\nValor da Passagem: " + passagem.getPreco() +
            "\nOrigem e Destino: " + passagem.getTrajeto().vizualizarTrajeto() +
            "Peso da Bagagem: " + pesoBagagem + "\n";
    }
}