public class AviaoComercial extends Aviao {
    
    int passageirosMax;

    public AviaoComercial(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, int passageirosMax) {
        super(serie, modelo, marca, local, capacidade, combustivel, consumoCombustivel, envergadura);
        this.passageirosMax = passageirosMax;
    }

    public boolean carregar (double peso){
        return false;
    }

    public boolean descarregar (double peso){
        return false;
    }


    public int getPassageirosMax() {
        return passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }



}
