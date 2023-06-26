import java.io.Serializable;

abstract class Aviao implements Serializable{

    private static int registros = 1_000_000;
    private final int serie;
    private String modelo;
    private String marca;
    private Aeroporto local;
    private double combustivelAtual;
    private double combustivelMax;
    private double consumoCombustivel;
    private double envergadura;
    private double pesoAtual;
    private final double pesoMax;

    public Aviao(String modelo, String marca, Aeroporto local, double combustivelMax,
            double consumoCombustivel, double envergadura, double pesoMax) {
        this.serie = gerarSerie();
        this.modelo = modelo;
        this.marca = marca;
        this.local = local;
        this.combustivelMax = combustivelMax;
        this.consumoCombustivel = consumoCombustivel;
        this.envergadura = envergadura;
        this.pesoMax = pesoMax;
    }

    public double calculaAlcance(){
        return combustivelAtual/consumoCombustivel;
    }

    public boolean abastercer(double volume){
        this.combustivelAtual += volume;
        return true;
    }

    public abstract boolean carregar(Voo voo);

    public boolean descarregar(){
        setPesoAtual(0);
        return true;
    }
    //Gets e Sets
    public int getSerie() {
        return serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Aeroporto getLocal() {
        return local;
    }

    public void setLocal(Aeroporto local) {
        this.local = local;
    }

    public double getCapacidade() {
        return combustivelMax;
    }

    public void setCombustivelMax(double combustivelMax) {
        this.combustivelMax = combustivelMax;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        this.combustivelAtual = combustivelAtual;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }
    
    public int gerarSerie() {
        /* Gera um número a partir do atributo de classe 'registros'.
        o ID gerado tem, pelo menos, 7 dígitos. */
        registros++;
        return registros;
    }
    
    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getPesoMax() {
        return pesoMax;
    }


    public String toString(){
        return "Número de série: " + this.serie + "\nModelo: " + this.modelo + "\nLocal atual: " + this.local + 
        "\nCapacidade: " + this.combustivelMax + "\nNível de combustível atual: " + this.combustivelAtual + 
        "\nConsumo de combustível(l/km): " + this.consumoCombustivel + "\nEnvergadura(m): " + this.envergadura + 
        "\nPeso atual: " + this.pesoAtual;
    }
}