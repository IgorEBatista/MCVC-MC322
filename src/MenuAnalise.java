public abstract class MenuAnalise {
    //Propriedades
    private static final int TOP = 3;
    private static Companhia companhia = Main.companhia;
    
    //Métodos
    public static String resumirInfos(){
        return "Informações sobre a companhia:" +
                "\nNome da Companhia: " + companhia.getNome() +
                "\nCNPJ: " + companhia.getCNPJ() +
                "\nFaturamento Total: " + companhia.calcularFaturamento() +
                "\nNúmero de Aeroportos: " + companhia.getlistaAeroportos().size() +
                "\nNúmero de Clientes: " + companhia.getListaClientes().size() +
                "\nNúmero de Aviões: " + companhia.getListaAvioes().size();
    }

    public static String listarTopOrigens(){
        return companhia.listarTopOrigens(TOP);
    }

    public static String listarTopDestinos(){
        return companhia.listarTopDestinos(TOP);
    }

    public static String listarAeroportos(){
        return companhia.listarAeroporto();
    }

    public static String listarAvioes(){
        return companhia.listarAvioes();
    }

    public static String listarClientes(){
        return companhia.listarClientes();
    }

}
