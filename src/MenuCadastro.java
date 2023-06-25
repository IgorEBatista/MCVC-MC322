import java.util.ArrayList;
import java.util.Calendar;

public abstract class MenuCadastro {
    // Atributo
    private static Companhia companhia = Main.companhia;
    
    //Métodos

    /**
     * Cadastra um novo aeroporto na companhia.
     * A lista de entradas estão na seguinte ordem: <p>
     * [0] - nome(String),
     * [1] - latitude(double),
     * [2] - longitude(double),
     * [3] - cidade(String),
     * [4] - larguraPista(double)
     */
    public static boolean cadastrarAeroporto(ArrayList<Object> entradas){
        try {
            Aeroporto aeroporto;
            Coordenada coordenada;
            String nome = (String)entradas.get(0);
            double lat = (double)entradas.get(1);
            double lon = (double)entradas.get(2);
            String cidade = (String)entradas.get(3);
            double largura = (double)entradas.get(4);

            coordenada = new Coordenada(lat, lon);
            aeroporto = new Aeroporto(nome, coordenada, cidade, largura);

            return companhia.adicionarAeroporto(aeroporto);

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Cadastra um novo Avião na companhia.
     * A lista de entradas estão na seguinte ordem: <p>
     * [0] - String modelo,
     * [1] - (String) marca,
     * [2] - (Aeroporto) local,
     * [3] - (double) combustivelMax,
     * [4] - (double) consumoCombustivel,
     * [5] - (double) envergadura,
     * [6] - (double) pesoMax,
     * [7] - (String) tipoAviao - "AviaoCargueiro" ou "AviaoComercial"
     * [8] - (String) tipoCarga ou (int) passageirosMax
     */
    public static boolean cadastrarAviao(ArrayList<Object> entradas){
        try {
            Aviao aviao;
            String modelo = (String)entradas.get(0);
            String marca = (String)entradas.get(1);
            Aeroporto aeroporto = (Aeroporto)entradas.get(2);
            double combustivelMax = (double)entradas.get(3);
            double consumoCombustivel = (double)entradas.get(4);
            double envergadura = (double)entradas.get(5);
            double pesoMax = (double)entradas.get(6);
            String tipoAviao = (String)entradas.get(7);

            if (tipoAviao.equals("AviaoCargueiro")) {
                String tipoCarga = (String)entradas.get(8);
                aviao = new AviaoCargueiro(modelo, marca, aeroporto, combustivelMax, consumoCombustivel, envergadura, pesoMax, tipoCarga);
                return companhia.adicionarAviao(aviao);
            }
            else if (tipoAviao.equals("AviaoComercial")) {
                int passageirosMax = (int)entradas.get(8);
                aviao = new AviaoComercial(modelo, marca, aeroporto, combustivelMax, consumoCombustivel, envergadura, pesoMax, passageirosMax);
                return companhia.adicionarAviao(aviao);
            }
            else {
                return false; // tipo de avião inválido
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Cadastra um novo Cliente na companhia.
     * A lista de entradas estão na seguinte ordem: <p>
     * [0] - (String) nome,
     * [1] - (String) telefone,
     * [2] - (String) email,
     * [3] - (String) tipoCliente - "ClientePF" ou "ClientePJ"
     * [4] - (String) cpf ou (String) cnpj
     * [5] - (Calendar) dataNascimento ou null
     */
    public static boolean cadastrarCliente(ArrayList<Object> entradas){
        try {
            Cliente cliente;
            String nome = (String)entradas.get(0);
            String telefone = (String)entradas.get(1);
            String email = (String)entradas.get(2);
            String tipoCliente = (String)entradas.get(3);

            if (tipoCliente.equals("ClientePF")) {
                String cpf = (String)entradas.get(4);
                Calendar dataNascimento = (Calendar)entradas.get(5);
                cliente = new ClientePF(nome, telefone, email, cpf, dataNascimento);
                return companhia.adicionarCliente(cliente);
            }
            else if (tipoCliente.equals("ClientePJ")) {
                String cnpj = (String)entradas.get(4);
                cliente = new ClientePJ(nome, telefone, email, cnpj);
                return companhia.adicionarCliente(cliente);
            }
            else {
                return false; // tipo de cliente inválido
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Cadastra um novo Voo no aeroporto de origem.
     * A lista de entradas estão na seguinte ordem: <p>
     * [0] - (Aviao) aviao,
     * [1] - (Aeroporto) origem,
     * [2] - (Aeroporto) destino
     */
    public static boolean cadastrarVoo(ArrayList<Object> entradas){
        try {
            Aviao aviao = (Aviao)entradas.get(0);
            Aeroporto origem = (Aeroporto)entradas.get(1);
            Aeroporto destino = (Aeroporto)entradas.get(2);
            
            return origem.adicionarVoo(destino, aviao);

        } catch (Exception e) {
            return false;
        }
    }
}
