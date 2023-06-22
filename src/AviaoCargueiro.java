public class AviaoCargueiro extends Aviao{
    
    private String tipoCarga;

    public AviaoCargueiro(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, String tipoCarga, double pesoAtual) {
        super(serie, modelo, marca, local, capacidade, combustivel, consumoCombustivel, envergadura);
        this.tipoCarga = tipoCarga;
        this.pesoAtual = pesoAtual;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String toString(){
        return super.toString() + "\nTipo de carga: " + this.tipoCarga;
    }
}