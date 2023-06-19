abstract class Aviao{

    final String serie;
    String modelo;
    String marca;
    Aeroporto local;
    double capacidade;
    double pesoAtual;
    double combustivel;
    double consumoCombustivel;
    double envergadura;

    public Aviao(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura) {
        this.serie = serie;
        this.modelo = modelo;
        this.marca = marca;
        this.local = local;
        this.pesoAtual = 0;
        this.capacidade = capacidade;
        this.combustivel = combustivel;
        this.consumoCombustivel = consumoCombustivel;
        this.envergadura = envergadura;
    }

    public double alcance(){
        return combustivel/consumoCombustivel;
    }

    public boolean abastercer(double volume){
        
        this.combustivel += volume;
        return true;
    }

    // Sempre será usada em overload
    public boolean carregar(double peso){
        return false;
    }

    // Sempre será usada em overload
    public boolean descarregar(double peso){
        return false;
    }


    //Gets e Sets
    public String getSerie() {
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
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
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

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

}