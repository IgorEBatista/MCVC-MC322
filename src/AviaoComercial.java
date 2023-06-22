import java.util.ArrayList;

public class AviaoComercial extends Aviao {
    
    private int passageirosMax;
    private ArrayList<Passageiro> listaPassageiros;

    public AviaoComercial(String serie, String modelo, String marca, Aeroporto local, double capacidade, double combustivel,
            double consumoCombustivel, double envergadura, int passageirosMax, ArrayList<Passageiro> listaPassageiros) {
        super(serie, modelo, marca, local, capacidade, combustivel, consumoCombustivel, envergadura);
        this.passageirosMax = passageirosMax;
        this.listaPassageiros = listaPassageiros;
    }

    @Override
    public boolean carregar(Voo voo){
        double peso_entrando = 0;
        for(Passageiro passageiro_iterado : voo.getListaPassageiros()){
            peso_entrando  += (passageiro_iterado.getPesoBagagem() + 70);
        }
        if (peso_entrando <= capacidade){
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

    public ArrayList<Passageiro> getListaPassageiros() {
        return listaPassageiros;
    }

    public void setListaPassageiros(ArrayList<Passageiro> listaPassageiros) {
        this.listaPassageiros = listaPassageiros;
    }

    public String toString(){
        String listaPassageiros_str = "";
        for(Passageiro passageiro_iterado : listaPassageiros){
            listaPassageiros_str = listaPassageiros_str +  passageiro_iterado.getNome() + "\n";
        }
        return "Número de série: " + this.serie + "\nModelo: " + this.modelo + "\nLocal atual: " + this.local + "\nCapacidade: " + this.capacidade + "\nNível de combustível atual: " + this.combustivel + "\nConsumo de combustível(l/km): " + this.consumoCombustivel + "\nEnvergadura(m): " + this.envergadura + "\nNúmero máximo de passageiros: " + this.passageirosMax + "\nLista de passageiros: " + listaPassageiros_str;
    }
}