public class Main {
    

    public static void main(String[] args) {
        
        Companhia companhia = new Companhia("61902722000126", "Companhia", 3);
        Coordenada coordenada = new Coordenada(-23.4322, -46.4692);
        Cidade cidade = new Cidade("Sao Paulo", "Brasil");
        Aeroporto aeroporto = new Aeroporto("Aeroporto", coordenada, cidade, 10);
        Aviao aviao = new AviaoComercial("SERIE", "777-300ER", "Boeing", aeroporto, 
        17170, 0, 1.2, 61, 400, null);

        companhia.adicionarAviao(aviao);
        companhia.adicionarCidade(cidade);
    
    }
}
