public class AviaoCargueiro extends Aviao{
    
    String tipoCarga;

    public AviaoCargueiro(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, String tipoCarga) {
        super(serie, modelo, marca, local, capacidade, combustivel, consumoCombustivel, envergadura);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public boolean carregar(double peso){
        if (getPesoAtual() + peso <= capacidade){
            setPesoAtual(getPesoAtual() + peso); 
            return true;
        }
        return false;
    }

    @Override
    public boolean descarregar(double peso){
        return false;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

}
