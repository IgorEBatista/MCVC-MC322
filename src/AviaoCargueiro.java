public class AviaoCargueiro extends Aviao{
    
    String tipoCarga;
    double pesoAtual;

    public AviaoCargueiro(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, String tipoCarga, double pesoAtual) {
        super(serie, modelo, marca, local, capacidade, combustivel, consumoCombustivel, envergadura);
        this.tipoCarga = tipoCarga;
        this.pesoAtual = pesoAtual;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_entrando  += (passageiro_iterado.getPesoBagagem() + 70);
        }
        if (getPesoAtual() + peso_entrando <= capacidade){
            setPesoAtual(getPesoAtual() + peso_entrando); 
            return true;
        }
        return false;
    }

    @Override
    public boolean descarregar(Voo voo){
        double peso_saindo = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_saindo  += (passageiro_iterado.getPesoBagagem() + 70);
        }
        if (getPesoAtual() + peso_saindo <= capacidade){
            setPesoAtual(getPesoAtual() + peso_saindo); 
            return true;
        }
        return false;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public String toString(){
        return "Número de série: " + this.serie + "\nModelo: " + this.modelo + "\nLocal atual: " + this.local + "\nCapacidade: " + this.capacidade + "\nNível de combustível atual: " + this.combustivel + "\nConsumo de combustível(l/km): " + this.consumoCombustivel + "\nEnvergadura(m): " + this.envergadura + "\nTipo de carga: " + this.tipoCarga + "\nPeso atual: " + this.pesoAtual;
    }
}