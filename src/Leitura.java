import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {
    
    public static void lerArquivo (File arquivo){

        ArrayList<String> infos = new ArrayList<String>();

        if (arquivo.exists()){
        try{

            // Separando as entradas em um Array fácil de lidar
            BufferedReader in = new BufferedReader(new FileReader(arquivo));
            String line;
            line = in.readLine();
            while (!line.equals("--")){       
               
                while(!line.equals("-") && !line.equals("--")){
                    infos.add(line);
                    infos.add("");
                    line = in.readLine();
                }
                infos.add("!");
                if (!line.equals("--")) {
                    line = in.readLine();
                }
            }
            in.close();

            } catch (IOException e){
                System.out.println(e.getCause());
            }
        }

        // Separando cada um dos objetos em sua classe
        ArrayList<ArrayList<String>> objetos = new ArrayList<ArrayList<String>>();
        ArrayList<String> caracteristicas = new ArrayList<String>();
        for (String item : infos){

            if (item.equals("!")){
                objetos.add(new ArrayList<String>(caracteristicas));
                caracteristicas.clear();
            }
            else{
                caracteristicas.add(item);
            }
        }

        for (int i = 0; i < 6; i++){ // Esse iterador deve passar por todas as classes

            ArrayList<String> aux = objetos.get(i);
            ArrayList<String> objeto = new ArrayList<String>();
            for (String s : aux){
                if (!s.equals("")){
                    objeto.add(s);
                }
            }
            for (String s : objeto){
                String[] parametros = s.split(", ");
                
                criarObjeto(i, parametros);
            }
        }

    }

    public static void criarObjeto(int index, String[] param){

        /* Cada índice representa uma classe que será lida pelo arquivo 
        0: Aeroporto
        1: AviaoComercial
        2: AviaoCargueiro
        3: ClientePF
        4: ClientePJ
        5: Voo
        */ 

        if (index == 0){
            Coordenada coordenada = new Coordenada(Double.parseDouble(param[1]), Double.parseDouble(param[2]));
            Aeroporto aeroporto = new Aeroporto(param[0], coordenada, param[3], Double.parseDouble(param[4]));
            Main.companhia.adicionarAeroporto(aeroporto);
        }
        
        else if (index == 1){
            AviaoComercial aviao = new AviaoComercial(param[0], param[1], Main.companhia.buscarAeroporto(param[2]), 
            Double.parseDouble(param[3]), Double.parseDouble(param[4]), Double.parseDouble(param[5]), Double.parseDouble(param[6]),
            Integer.parseInt(param[7]));
            Main.companhia.adicionarAviao(aviao);
        }

        else if (index == 2){
            AviaoCargueiro aviao = new AviaoCargueiro(param[0], param[1], Main.companhia.buscarAeroporto(param[2]), 
            Double.parseDouble(param[3]), Double.parseDouble(param[4]), Double.parseDouble(param[5]), Double.parseDouble(param[6]),
            param[7]);
            Main.companhia.adicionarAviao(aviao);
        }

        else if (index == 3){
            ClientePF cliente = new ClientePF(param[0], param[1], param[2], param[3], Validacao.formataData(param[4]));
            Main.companhia.adicionarCliente(cliente);
        }

        else if (index == 4){
            ClientePJ cliente = new ClientePJ(param[0], param[1], param[2], param[3]);
            Main.companhia.adicionarCliente(cliente);
        }

        else if (index == 5){
            Aviao aviao = Main.companhia.buscarAviao(param[0]);
            // Aeroporto origem = Main.companhia.buscarAeroporto(param[1]);
            Aeroporto origem = aviao.getLocal();
            // Aeroporto destino = Main.companhia.buscarAeroporto(param[1]);
            Aeroporto destino = Main.companhia.getlistaAeroportos().get(Integer.parseInt(param[1]));
            if (destino == origem) {
                destino = Main.companhia.getlistaAeroportos().get((Integer.parseInt(param[1]) + 1) % 20);
            }
            origem.adicionarVoo(destino, aviao);
        }
    }
}
