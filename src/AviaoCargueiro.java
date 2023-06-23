public class AviaoCargueiro extends Aviao{
    
    private String tipoCarga;
    
    public AviaoCargueiro(String modelo, String marca, Aeroporto local, double combustivelMax,
                            double consumoCombustivel, double envergadura, double pesoMax, String tipoCarga) {
        super(modelo, marca, local, combustivelMax, consumoCombustivel, envergadura, pesoMax);
        this.tipoCarga = tipoCarga;
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