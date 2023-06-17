import java.util.ArrayList;
import java.util.Calendar;

public class Passagem {
    // Atributos (Propriedades)
    private static int registros = 1_000_000;
    private final int ID;
    private double preco;
    private Trajeto trajeto;
    private Calendar data;
    private Cliente comprador;


    // Construtor
    public Passagem(Trajeto trajeto, Calendar data, Cliente comprador) {
        this.ID = gerarID();
        this.preco = calcularPreco();
        this.trajeto = trajeto;
        this.data = data;
        this.comprador = comprador;
    }

    // Métodos

    // - Getters e Setters

    public int getID() {
        return ID;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco() {
        this.preco = calcularPreco();
    }

    public Trajeto getTrajeto() {
        return trajeto;
    }

    public void setTrajeto(Trajeto trajeto) {
        this.trajeto = trajeto;
        setPreco();
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
        setPreco();
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }


    // - Funções da classe Passagem

    public int gerarID() {
        /* Gera um número a partir do atributo de classe 'registros'.
        o ID gerado tem, pelo menos, 7 dígitos. */
        registros++;
        return registros;
    }

    public double calcularPreco() {
        /* Retorna o preço a ser pago pelo cliente para comprar a passagem.
        Pode depender do trajeto, da classe economica, da data etc
        TODO: Implementar */
        double preco = 0;
        return preco;
    }

    @Override
    public String toString() {
        return "ID da passagem: " + this.ID + "\n" + 
               "Preco: " + this.preco + "\n" +
               "Trajeto: " + this.trajeto + "\n" +
               "Data: " + this.data + "\n" +
               "Cliente: " + this.comprador + "\n";
    }
}
