public class Main {
    

    public static void main(String[] args) {
        
        Companhia companhia = new Companhia("61902722000126", "Companhia", 3);
        Coordenada coordenada = new Coordenada(-23.4322, -46.4692);
        Aeroporto aeroporto1 = new Aeroporto("Aeroporto1", coordenada, "Sao Paulo", 10);
        Aeroporto aeroporto2 = new Aeroporto("Aeroporto2", coordenada, "Rio", 10);
        Aeroporto aeroporto3 = new Aeroporto("Aeroporto3", coordenada, "Campinas", 10);
        Aeroporto aeroporto4 = new Aeroporto("Aeroporto4", coordenada, "Boituva", 10);
        Aeroporto aeroporto5 = new Aeroporto("Aeroporto5", coordenada, "Belem", 10);
        companhia.adicionarAeroporto(aeroporto1);
        companhia.adicionarAeroporto(aeroporto2);
        companhia.adicionarAeroporto(aeroporto3);
        companhia.adicionarAeroporto(aeroporto4);
        companhia.adicionarAeroporto(aeroporto5);
        Aviao aviao = new AviaoComercial("777-300ER", 
                                         "Boeing", 
                                         aeroporto1,
                                         17170.0,
                                         1.2,
                                         61,
                                         400,
                                         0);    
        companhia.adicionarAviao(aviao);
        aeroporto1.cadastrarVoo(aeroporto2, aviao);
        aeroporto2.cadastrarVoo(aeroporto5, aviao);
        aeroporto1.cadastrarVoo(aeroporto3, aviao);
        aeroporto3.cadastrarVoo(aeroporto5, aviao);
        aeroporto1.cadastrarVoo(aeroporto4, aviao);
        aeroporto4.cadastrarVoo(aeroporto5, aviao);

        companhia.calculaTrajetos(aeroporto1, aeroporto5);



    
    }
}
