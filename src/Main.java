public class Main {
    

    public static void main(String[] args) {
        
        Companhia companhia = new Companhia("61902722000126", "Companhia", 3);
        Coordenada coordenada = new Coordenada(-23.4322, -46.4692);
        Aeroporto aeroporto = new Aeroporto("Aeroporto", coordenada, "Sao Paulo", 10);
        Aeroporto aeroporto2 = new Aeroporto("Aeroporto", coordenada, "Rio", 10);
        companhia.adicionarAeroporto(aeroporto2);
        companhia.adicionarAeroporto(aeroporto);
        Aviao aviao = new AviaoComercial("SERIE", "777-300ER", "Boeing", aeroporto, 17170, 0, 1.2, 61, 400, null);
        aeroporto.cadastrarVoo(aeroporto2, aviao);

        companhia.calculaTrajetos(aeroporto, aeroporto2);

        companhia.calculaTrajetos(aeroporto, aeroporto2);



        companhia.adicionarAviao(aviao);
    
    }
}
