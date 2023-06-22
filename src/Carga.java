public class Carga {
    private static int registros = 1_000_000;
    private final int ID;    
    private String tipoCarga;
    private double peso;
    private Passagem passagem;

    public Carga(String tipoCarga, doule peso, Passagem passagem){
        this.ID = gerarID();


    }


}
