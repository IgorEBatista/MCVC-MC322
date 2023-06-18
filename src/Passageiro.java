import java.util.ArrayList;
import java.util.Calendar;

public class Passageiro {
    
    private static int serie = 0;
    private final int ID;
    private Cliente comprador;
    private Voo voo;
    private double preco;
    private ArrayList<Caminho> escalas;
    private Calendar data;

    //Constructor
    public Passageiro(Cliente comprador, Voo voo, double preco, Calendar data) {
        this.ID = serie;
        this.comprador = comprador;
        this.voo = voo;
        this.preco = preco;
        this.escalas = new ArrayList<Caminho>();
        this.data = data;

        serie++;
    }

    // Sets e Gets
    public int getID() {
        return ID;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Caminho> getEscalas() {
        return escalas;
    }
 
    public void setEscalas(ArrayList<Caminho> escalas) {
        this.escalas = escalas;
    }
 
    public Calendar getData() {
        return data;
    }
 
    public void setData(Calendar data) {
        this.data = data;
    }

    //Outros métodos

    public double calculaPreco() {
        ///TODO implementar metodo
        throw new UnsupportedOperationException("Unimplemented method 'calculaPreco");
    }

    public ArrayList<Voo> listaEscalas(){
        //TODO implementar metodo
        throw new UnsupportedOperationException("Unimplemented method 'listaEscalas'");
    }

    public ArrayList<Aeroporto> calculaRota(){
        //TODO implementar metodo
        throw new UnsupportedOperationException("Unimplemented method 'calculaRota'");
    }

}
