// Esqueleto pronto!

import java.util.ArrayList;

public class Companhia {
    // Atributos (Propriedades)
    private final String CNPJ;
    private String nome;
    private ArrayList<Cidade> listaCidades;     // Lista de cidades em que a companhia atua
    private ArrayList<Conexao> listaConexoes;   // Lista de conexões que existem entre Aeroporto-Aeroporto
    private ArrayList<Aviao> listaAvioes;       // Lista de aviões da companhia
    private ArrayList<Cliente> listaClientes;   // Lista de clientes cadastrados na companhia


    // Construtor
    public Companhia(String CNPJ, String nome) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.listaCidades = new ArrayList<Cidade>();
        this.listaConexoes = new ArrayList<Conexao>();
        this.listaAvioes = new ArrayList<Aviao>();
        this.listaClientes = new ArrayList<Cliente>();
    }


    // Métodos

    // - Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cidade> getListaCidades() {
        return listaCidades;
    }

    public ArrayList<Conexao> getListaConexoes() {
        return listaConexoes;
    }

    public ArrayList<Aviao> getListaAvioes() {
        return listaAvioes;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }


    // - Funções da classe Companhia

    // -- Cidade

    public boolean adicionarCidade(Cidade cidade) {
        /* Adiciona, na lista de cidades, a cidade dada como parâmetro.
        Se já estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (!listaCidades.contains(cidade)) {
            listaCidades.add(cidade);
            return true;
        }
        return false;
    }

    public boolean removerCidade(Cidade cidade) {
        /* Remove, da lista de cidades, a cidade dada como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaCidades.contains(cidade)) {
            listaCidades.remove(cidade);
            return true;
        }
        return false;
    }

    public Cidade buscarCidade(String nome) {
        /* Busca, na lista de cidades, a cidade que tem o nome
        dada como parâmetro.
        Retorna a cidade se ela estiver na lista.
        Caso contrário, retorna null. */
        for (Cidade c : listaCidades) 
            if (c.getNome().equals(nome))
                return c;
        return null;
    }

    public String listarCidades() {
        /* Retorna uma string com as cidades onde a companhia atua.
        TODO: Implementar */
        String lista = "Lista de Cidades:\n";
        return lista;
    }

    // -- Conexao

    public boolean adicionarConexao(Conexao conexao) {
        /* Adiciona, na lista de conexões, a conexão dada como parâmetro.
        Se já estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (!listaConexoes.contains(conexao)) {
            listaConexoes.add(conexao);
            return true;
        }
        return false;
    }

    public boolean removerConexao(Conexao conexao) {
        /* Remove, da lista de conexões, a conexão dada como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaConexoes.contains(conexao)) {
            listaConexoes.remove(conexao);
            return true;
        }
        return false;
    }

    public ArrayList<ArrayList<Conexao>> verificarConexoes(Cidade A, Cidade B) {
        /* Retorna uma lista de todas as conexões entre as cidades A e B.
        Ou seja, A e B podem não estar conectadas diretamente, mas pode
        haver um caminho para elas.
        TODO: Implementar um algoritmo de grafos. */
        return null;
    }

    public String listarConexoes() {
        /* Retorna uma string com as conexões que a companhia possui.
        TODO: Implementar */
        String lista = "Lista de Conexoes:\n";
        return lista;
    }

    // -- Aviao

    public boolean adicionarAviao(Aviao aviao) {
        /* Adiciona, na lista de aviões, o avião dado como parâmetro.
        Se já estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (!listaAvioes.contains(aviao)) {
            listaAvioes.add(aviao);
            return true;
        }
        return false;
    }

    public boolean removerAviao(Aviao aviao) {
        /* Remove, da lista de aviões, o avião dado como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaAvioes.contains(aviao)) {
            listaAvioes.remove(aviao);
            return true;
        }
        return false;
    }

    public Aviao buscarAviao(String serie) {
        /* Busca, na lista de aviões, o avião que tem o número de série
        dado como parâmetro.
        Retorna o avião se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Aviao a: listaAvioes) 
            if (a.getSerie().equals(serie))
                return a;
        return null;
    }

    public String listarAvioes() {
        /* Retorna uma string com os aviões que a companhia possui.
        TODO: Implementar */
        String lista = "Lista de Avioes:\n";
        return lista;
    }

    // -- Cliente

    public boolean cadastrarCliente(Cliente cliente) {
        /* Adiciona na listaClientes o cliente dado como parâmetro.
        Se o cliente já for cadastrado, retorna False.
        Caso contrário, retorna True. */
        if (!listaClientes.contains(cliente)) {
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean removerCliente(Cliente cliente) {
        /* Remove de listaClientes o cliente dado como parâmetro.
        Remove de listaSeguros todos os seguros associados a este cliente.
        Se o cliente não for cadastrado, retorna False.
        Caso contrário, retorna True. */
        if (listaClientes.contains(cliente)) {
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String identificacao) {
        /* Busca, na lista de clientes, o cliente cujo
        CPF ou CNPJ é igual à identificação dada como parâmetro.
        Retorna o cliente que atende ao critério se ele estiver na lista.
        Caso contrário, retorna null. */
        identificacao = identificacao.replaceAll("[^0-9]", "");
        for (Cliente c : listaClientes) {
            if (c instanceof ClientePF) {
                String cpf = ((ClientePF)c).getCPF().replaceAll("[^0-9]", "");
                if (cpf.equals(identificacao))
                    return c;
            }
            else if (c instanceof ClientePJ) {
                String cnpj = ((ClientePJ)c).getCNPJ().replaceAll("[^0-9]", "");
                if (cnpj.equals(identificacao))
                    return c;
            }
        }
        return null;
    }

    public String listarClientes() {
        /* Retorna uma string com os clientes que a companhia possui.
        TODO: Implementar */
        String lista = "Lista de Clientes:\n";
        return lista;
    }

    // -- Análise de vendas

    public ArrayList<Voo> getTopVoos() {
        /* Retorna uma lista dos voos mais comuns.
        TODO: Implementar */
        return null;
    }

    public String listarTopVoos() {
        /* Retorna uma string com os voos mais comuns da companhia.
        TODO: Implementar */
        String lista = "Voos mais comuns:\n";
        return lista;
    }

    public ArrayList<Cidade> getTopOrigens() {
        /* Retorna uma lista das origens mais comuns.
        TODO: Implementar 
        (faz sentido ter origens mais comuns?)*/
        return null;
    }

    public String listarTopOrigens() {
        /* Retorna uma string com as origens mais comuns da companhia. 
        TODO: Implementar */
        String lista = "Origens mais comuns:\n";
        return lista;
    } // Estranho

    public ArrayList<Cidade> getTopDestinos() {
        /* Retorna uma lista dos destinos mais comuns.
        TODO: Implementar */
        return null;
    }

    public String listarTopDestinos() {
        /* Retorna uma string com a lista dos destinos mais comuns da companhia.
        TODO: Implementar */
        String lista = "Destinos mais comuns:\n";
        return lista;
    }

    public double calcularFaturamento() {
        /* Calcula, a partir do histórico de compras de cada cliente,
        o quanto a companhia já faturou com suas vendas de passagens. */
        double faturamento = 0;
        for (Cliente c : listaClientes) {
            for (Passagem p : c.getHistoricoDeCompras()) {
                faturamento += p.getPreco();
            }
        }
        return faturamento;
    }

    public ArrayList<Trajeto> getTrajetos(Cidade origem, Cidade destino) {
        ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();
        /* Calcula os possíveis trajetos para viajar da origem para o destino.
        TODO: Implementar */
        return trajetos;
    }

    public String listarTrajetos(Cidade origem, Cidade destino) {
        /* Calcula os possíveis trajetos para viajar da origem para o destino.
        TODO: Implementar */
        String lista = "Lista de trajetos:\n";
        return lista;
    }

    @Override
    public String toString() {
        return "CNPJ: " + this.CNPJ + "\n" + 
               "Nome: " + this.nome + "\n";
    }
}
