public abstract class MenuAnalise {
    //Propriedades
    private static final int TOP = 3;
    
    //Métodos
    public static String resumirInfos(Companhia companhia){
        return "Informações sobre a companhia:" +
                "\nNome da Companhia: " + companhia.getNome() +
                "\nCNPJ: " + companhia.getCNPJ() +
                "\nFaturamento Total: " + companhia.calcularFaturamento() +
                "\nNúmero de Aeroportos: " + companhia.getlistaAeroportos().size() +
                "\nNúmero de Clientes: " + companhia.getListaClientes().size() +
                "\nNúmero de Aviões: " + companhia.getListaAvioes().size();
    }

    public static String listarTopOrigens(Companhia companhia){
        return companhia.listarTopOrigens(TOP);
    }

    public static String listarTopDestinos(Companhia companhia){
        return companhia.listarTopDestinos(TOP);
    }

    public static String listarAeroportos(Companhia companhia){
        return companhia.listarAeroporto();
    }

    public static String listarAvioes(Companhia companhia){
        return companhia.listarAvioes();
    }

    public static String listarClientes(Companhia companhia){
        return companhia.listarClientes();
    }

}
