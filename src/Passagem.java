import java.io.Serializable;
import java.util.Calendar;

public class Passagem implements Serializable {
    // Atributos (Propriedades)
    private static int registros = 1_000_000;
    private final int ID;
    private double preco;
    private Trajeto trajeto;
    private Calendar data;
    private Cliente comprador;

    private final double CUSTO_KM = 0.3;


    // Construtor
    /**
     * 
     * @param trajeto
     * @param data
     * @param comprador
     */
    public Passagem(Trajeto trajeto, Calendar data, Cliente comprador) {
        this.ID = gerarID();
        this.trajeto = trajeto;
        this.data = data;
        this.comprador = comprador;
        this.preco = calcularPreco();
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
        Pode depender do trajeto, da classe economica, da data etc */

        double fatDist, fatEscal, fatDia = 1, preco = 0;
        int semana = data.get(Calendar.DAY_OF_WEEK);
        fatDist = CUSTO_KM * trajeto.getDistanciaTotal()/1000;
        fatEscal = 2.0 / (1 + trajeto.getRota().size());
        
        if ((semana % 6) < 3) {
            if ((semana % 2) == 0) {
                fatDia = 1.5;
            } else {
                fatDia = 2.0;
            }
        } else {
            fatDia = 1.0;
        }
        preco = fatDist * fatEscal * fatDia;
        return Math.round(preco);
    }

    @Override
    public String toString() {
        return "ID da passagem: " + this.ID + "\n" + 
               "Preco: " + this.preco + "\n" +
               "Trajeto: " + this.trajeto + "" +
               "Data: " + this.data.getTime() + "\n" +
               "Cliente: " + this.comprador.getNome() + "\n";
    }
}
