public abstract class MenuRemocao {
    //TODO implementar
    private static Companhia companhia = Main.companhia;


    //Métodos
    
    /**
     * 
     * @param nome
     * @return
     */
    public static boolean removerAeroporto(String nome) {
        //TODO implementar.

        return false;
    }

    /**
     * 
     * @param serie
     * @return true caso sucesso.
     */
    public static boolean removerAviao(int serie) {
        //TODO implementar

        return false;
    }

    public static boolean removerCliente(String identificador) {
        Cliente cliente = companhia.buscarCliente(identificador);

        if (cliente instanceof ClientePF) {
            return removerClientePF(cliente);
        } else if(cliente instanceof ClientePJ){
            return removerClientePJ(cliente);
        }
        return false;
    }

    /**
     * 
     * 
     * @param CPF
     * @return
     */
    private static boolean removerClientePF(Cliente cliente) {
        //TODO implementar
        return false;
    }

    /**
     * 
     * @param CNPJ
     * @return
     */
    private static Boolean removerClientePJ(Cliente cliente) {
        //TODO implementar
        return false;
    }

    /**
     * 
     * @param origem 
     * @param destino
     * @return
     */
    public static boolean removerVoo(Aeroporto origem, Aeroporto destino) {
        //TODO implementar
        return false;
    }
}
