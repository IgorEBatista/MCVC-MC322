public abstract class MenuExcluir {
    // Atributo
    private static Companhia companhia = Main.companhia;

    //Métodos

    /**
     * Remove um aeroporto da companhia.
     * @param nome
     * @return false
     * true se for removido e false caso contrário.
     */
    public static boolean excluirAeroporto(String nome) {
        Aeroporto aeroporto = companhia.buscarAeroporto(nome);
        return companhia.removerAeroporto(aeroporto);
    }

    /**
     * Remove um aviao da companhia.
     * @param serie
     * @return
     * true se for removido e false caso contrário.
     */
    public static boolean excluirAviao(int serie) {
        Aviao aviao = companhia.buscarAviao(serie);
        return companhia.removerAviao(aviao);
    }

    /**
     * Remove um cliente da companhia.
     * @param identificador
     * @return
     * true se for removido e false caso contrário.
     */
    public static boolean excluirCliente(String identificador) {
        Cliente cliente = companhia.buscarCliente(identificador);
        return companhia.removerCliente(cliente);
    }

    /**
     * Remove um voo dos aeroportos.
     * @param codigo
     * @param origem 
     * @param destino
     * @return
     * true se for removido e false caso contrário.
     */
    public static boolean excluirVoo(int codigo, Aeroporto origem, Aeroporto destino) {
        Voo voo = origem.buscarVoo(codigo);
        if (voo == null) {
            return false;
        }
        origem.removerVoo(voo);
        for (Voo v : destino.getListaVoos()) {
            if (v.getOrigem() == origem) {
                destino.removerVoo(v);
                return true;
            }
        }
        return false;
    }
}
