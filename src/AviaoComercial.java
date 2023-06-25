public class AviaoComercial extends Aviao {
    
    private int passageirosMax;

    public AviaoComercial(String modelo, String marca, Aeroporto local, double combustivelMax,
            double consumoCombustivel, double envergadura, double pesoMax, int passageirosMax) {
        super(modelo, marca, local, combustivelMax, consumoCombustivel, envergadura, pesoMax);
        this.passageirosMax = passageirosMax;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_entrando  += (passageiro_iterado.getPesoBagagem() + Passageiro.pesoMedio);

        }
        if (peso_entrando <= (getPesoMax())){
            setPesoAtual(peso_entrando); 
            return true;
        }
        return false;
    }

    public int getPassageirosMax() {
        return passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNúmero máximo de passageiros: " + this.passageirosMax;
    }
}