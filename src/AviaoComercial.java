public class AviaoComercial extends Aviao {
    
    private int passageirosMax;

    public AviaoComercial(String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, int passageirosMax, double pesoAtual, double pesoMax) {
        super(modelo, marca, local, capacidade, consumoCombustivel, envergadura, pesoAtual, pesoMax);
        this.passageirosMax = passageirosMax;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_entrando  += (passageiro_iterado.getPesoBagagem() + 70);

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