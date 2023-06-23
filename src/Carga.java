public class Carga {
    private static int registros = 1_000_000;
    private final int ID;    
    private String tipoCarga;
    private double peso;
    private Passagem passagem;

    public Carga(String tipoCarga, double peso, Passagem passagem){
        this.ID = gerarID();
        this.tipoCarga = tipoCarga;
        this.peso = peso;
        this.passagem = passagem;
    }

    //Métodos
    public int gerarID() {
        /* Gera um número a partir do atributo de classe 'registros'.
        o ID gerado tem, pelo menos, 7 dígitos. */
        registros++;
        return registros;
    }

    //getters e setters
    public int getID() {
        return ID;
    }
    
    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public String toString(){
        return "ID" + this.ID + "\nTipo de carga: " + this.tipoCarga + "\nPeso da carga: " + 
        this.peso + "\nID da passagem associada: " + this.passagem.getID(); 
    }
}