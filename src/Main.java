import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static Companhia companhia;

    public static void main(String[] args) {

        companhia = new Companhia("61902722000126",
                                  "Companhia",
                                  3);

        File entradas = new File("C:\\Users\\igore\\Documents\\Unicamp\\2023 - S1\\MC322\\Grupo-MCVC\\MCVC-MC322\\src\\entrada.txt");
        Leitura.lerArquivo(entradas);

        Coordenada coordenada1 = new Coordenada(-23.4322, -46.4692);
        Coordenada coordenada2 = new Coordenada(-22.8089, -43.2436);
        Coordenada coordenada3 = new Coordenada(-23.006944, -47.134444);
        Coordenada coordenada4 = new Coordenada(-23.2854, -47.674);
        Coordenada coordenada5 = new Coordenada(-1.437778, -48.468889);

        Aeroporto aeroporto1 = new Aeroporto("Aeroporto1", coordenada1, "Sao Paulo", 10);
        Aeroporto aeroporto2 = new Aeroporto("Aeroporto2", coordenada2, "Rio", 10);
        Aeroporto aeroporto3 = new Aeroporto("Aeroporto3", coordenada3, "Campinas", 10);
        Aeroporto aeroporto4 = new Aeroporto("Aeroporto4", coordenada4, "Boituva", 10);
        Aeroporto aeroporto5 = new Aeroporto("Aeroporto5", coordenada5, "Belem", 10);
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
        
        aeroporto1.adicionarVoo(aeroporto2, aviao);
        aeroporto2.adicionarVoo(aeroporto5, aviao);
        aeroporto1.adicionarVoo(aeroporto3, aviao);
        aeroporto3.adicionarVoo(aeroporto5, aviao);
        aeroporto1.adicionarVoo(aeroporto4, aviao);
        aeroporto1.adicionarVoo(aeroporto5, aviao);
        aeroporto4.adicionarVoo(aeroporto5, aviao);

        companhia.getNomeAeroportos();

        ArrayList<Trajeto> saida = new ArrayList<Trajeto>();

        saida = companhia.verificaTodosCaminhos(aeroporto1, aeroporto5);
        Collections.sort(saida);
        
        System.out.println(companhia.listarTrajetos(aeroporto1, aeroporto5));
    }
}
