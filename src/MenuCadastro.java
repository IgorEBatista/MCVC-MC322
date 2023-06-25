import java.util.ArrayList;

public abstract class MenuCadastro {

    private static Companhia companhia = Main.companhia;
    //Métodos

    /**
     * Cadastra um Novo aeroporto, a lista de entradas estão na seguinte ordem: <p>
     * [0] - nome(String), [1] - latitude(double), [2] longitude(double), [3] - cidade(String), [4] - larguraPista(double)
     */
    public static boolean cadastrarAeroporto(ArrayList<Object> entradas){
        try {
            Aeroporto aeroporto;
            Coordenada coordenada;
            double lat = (double)entradas.get(1), lon = (double)entradas.get(2), largura = (double)entradas.get(4);
            String nome = (String)entradas.get(0), cidade = (String)entradas.get(3);
            
            coordenada = new Coordenada(lat, lon);
            aeroporto = new Aeroporto(nome, coordenada, cidade, largura);
            return companhia.adicionarAeroporto(aeroporto);
        } catch (Exception e) {
            return false;
        }        
    }

    /**
     * Cadastra um Novo Avião, a lista de entradas estão na seguinte ordem: <p>
     * [0] String modelo,[1] - (String) marca,[2] - (Aeroporto) local,[3] - (double) combustivelMax,
     * [4] - (double) consumoCombustivel,[5] - (double) envergadura,[6] - (double) pesoMax
     */
    public static boolean cadastrarAviao(ArrayList<Object> entradas){
        //TODO implementar
        return false;
    }

    /**
     * Cadastra um Novo Cliente, a lista de entradas estão na seguinte ordem: <p>
     * [0] - (String) nome, [1] - (String) telefone, [2] - (String) email
     */
    public static boolean cadastrarCliente(ArrayList<Object> entradas){
        //TODO implementar
        return false;
    }

    /**
     * Cadastra um Novo Voo, a lista de entradas estão na seguinte ordem: <p>
     * [0] - (Aviao) aviao,[1] - (Aeroporto) origem,[2] - (Aeroporto) destino
     */
    public static boolean cadastrarVoo(ArrayList<Object> entradas){
        //TODO implementar
        return false;
    }
}
