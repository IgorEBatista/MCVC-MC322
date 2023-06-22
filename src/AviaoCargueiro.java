public class AviaoCargueiro extends Aviao{
    
    private String tipoCarga;
    
    public AviaoCargueiro(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
                            double consumoCombustivel, double envergadura, String tipoCarga, double pesoAtual, double pesoMax) {
        super(modelo, marca, local, capacidade, consumoCombustivel, envergadura, pesoAtual, pesoMax);
        this.tipoCarga = tipoCarga;
        this.pesoAtual = pesoAtual;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Carga carga_iterada : voo.getListaCargas()){
            peso_entrando += (carga_iterada.getPeso());
        }
        if (peso_entrando <= getPesoMax()){
            setPesoAtual(peso_entrando); 
            return true;
        }
        return false;
    }

    @Override
    public boolean descarregar(){
        setPesoAtual(0);
        return true;
    }
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTipo de carga: " + this.tipoCarga;
    }
}