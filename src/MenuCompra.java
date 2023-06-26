import java.util.ArrayList;
import java.util.Calendar;

public class MenuCompra {

    private static Companhia companhia = Main.companhia;

    //Métodos

    /**
     * Cadastra um novo Avião na companhia. <br><br>
     * A lista de entradas estão na seguinte ordem: <p>
     * [0] - (String) Nome aeroporto de Origem, <br><br>
     * [1] - (String) Nome aeroporto de Destino, <br><br>
     * [2] - (Calendar) Data da viagem, <br><br>
     */
    public static ArrayList<Passagem> simularCompra(ArrayList<Object> entradas) {
        Aeroporto origem = companhia.buscarAeroporto((String)entradas.get(0)), destino = companhia.buscarAeroporto((String)entradas.get(1));
        Calendar data = (Calendar)entradas.get(2);
        ArrayList<Passagem> possiveis = new ArrayList<Passagem>();
        ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();
        trajetos = companhia.calcularTrajetos(origem, destino);
        for (Trajeto trajeto : trajetos) {
            possiveis.add(new Passagem(trajeto, data, null));
        }
        return possiveis;
    }
}

