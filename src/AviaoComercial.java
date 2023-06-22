import java.util.ArrayList;

public class AviaoComercial extends Aviao {
    
    private int passageirosMax;

    public AviaoComercial(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, int passageirosMax) {
        super(serie, modelo, marca, local, capacidade, consumoCombustivel, envergadura);
        this.passageirosMax = passageirosMax;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_entrando  += (passageiro_iterado.getPesoBagagem() + 70);
        }
        if (peso_entrando <= getCombustivel()){
            setPesoAtual(peso_entrando); 
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

    public int getPassageirosMax() {
        return passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }

    public String toString(){
        return super.toString() + "\nNúmero máximo de passageiros: " + this.passageirosMax;
    }
}