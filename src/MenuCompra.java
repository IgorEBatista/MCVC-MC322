import java.util.ArrayList;

public class MenuCompra {
    //TODO implementar
    private static Companhia companhia = Main.companhia;

    public static ArrayList<Passagem> simularCompra(ArrayList<Object> entradas) {
        Aeroporto origem = companhia.buscarAeroporto((String)entradas.get(0)), destino = companhia.buscarAeroporto((String)entradas.get(1));
        
        ArrayList<Passagem> possiveis = new ArrayList<Passagem>();
        ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();


    }





}