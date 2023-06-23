// Esqueleto pronto!
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Companhia {
    // Atributos (Propriedades)
    private final String CNPJ;
    private String nome;
    private ArrayList<Aeroporto> listaAeroportos;     // Lista de cidades em que a companhia atua
    private ArrayList<Conexao> listaConexoes;   // Lista de conexões que existem entre Aeroporto-Aeroporto
    private ArrayList<Aviao> listaAvioes;       // Lista de aviões da companhia
    private ArrayList<Cliente> listaClientes;   // Lista de clientes cadastrados na companhia
    private int limiteEscalas;
    
    // Construtor
    public Companhia(String CNPJ, String nome, int limiteEscalas) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.listaAeroportos = new ArrayList<Aeroporto>();
        this.listaConexoes = new ArrayList<Conexao>();
        this.listaAvioes = new ArrayList<Aviao>();
        this.listaClientes = new ArrayList<Cliente>();
        this.limiteEscalas = limiteEscalas;
    }
    // Métodos

    // - Getters e Setters
    
    public String getCNPJ() {
        return CNPJ;
    }

    public int getLimiteEscalas() {
        return limiteEscalas;
    }


    public void setLimiteEscalas(int limiteEscalas) {
        this.limiteEscalas = limiteEscalas;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aeroporto> getlistaAeroportos() {
        return listaAeroportos;
    }
    
    public void setlistaAeroportos(ArrayList<Aeroporto> listaAeroportos) {
        this.listaAeroportos = listaAeroportos;
    }
    
    
    public ArrayList<Conexao> getListaConexoes() {
        return listaConexoes;
    }

    public void setListaConexoes(ArrayList<Conexao> listaConexoes) {
        this.listaConexoes = listaConexoes;
    }
    
    public ArrayList<Aviao> getListaAvioes() {
        return listaAvioes;
    }
    
    public void setListaAvioes(ArrayList<Aviao> listaAvioes) {
        this.listaAvioes = listaAvioes;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    // - Funções da classe Companhia

    // -- Cidade

    public boolean adicionarAeroporto(Aeroporto aeroporto){
        /* Adiciona, na lista de aeroportos, o aeroporto dado como parâmetro.
        Se já estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (!listaAeroportos.contains(aeroporto)) {
            listaAeroportos.add(aeroporto);
            return true;
        }
        return false;
    }

    public boolean removerAeroporto(Aeroporto aeroporto){
        /* Remove, da lista de aeroportos, o aeroporto dado como parâmetro.
        Se não estiver na lista, retorna False.
        Caso contrário, retorna True. */
        if (listaAeroportos.contains(aeroporto)) {
            listaAeroportos.remove(aeroporto);
            return true;
        }
        return false;
    }

    public Aeroporto buscarAeroporto(String nome) {
        /* Busca, na lista de aeroportos, o aeroporto que tem o nome
        dado como parâmetro.
        Retorna o aeroporto se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Aeroporto a : listaAeroportos) 
            if (a.getNome().equals(nome))
                return a;
        return null;
    }

    public String listarAeroporto() {
        /* Retorna uma string com os aeroportos da cidade. */
        if (listaAeroportos.size() == 0)
            return this.getNome() + " não possui aeroportos.\n";
        String lista = "--------------------------------------------------\n" +
                       "Aeroportos em " + this.getNome() + " :\n" +
                       "--------------------------------------------------\n";
        for (Aeroporto a : listaAeroportos)
            lista += a.toString() + "------------------------------\n";
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
            if (String.valueOf(a.getSerie()).equals(serie))
                return a;
        return null;
    }

    public String listarAvioes() {
        /* Retorna uma string com os aviões que a companhia possui. */
        if (listaConexoes.size() == 0)
            return "A companhia " + this.getNome() + " ainda não possui aviões.\n";
        String lista = "--------------------------------------------------\n" +
                       "Aviões da companhia " + this.getNome() + ":\n" +
                       "--------------------------------------------------\n";
        for (Aviao a : listaAvioes)
            lista += a.toString() + "------------------------------\n";
        return lista;
    }

    // -- Cliente

    public boolean adicionarCliente(Cliente cliente) {
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
        /* Retorna uma string contendo todos os clientes da companhia. */
        if (listaClientes.size() == 0)
            return "Ainda não há clientes cadastrados em " + this.nome + ".\n";
        String lista = "--------------------------------------------------\n" +
                       "Clientes de " + this.nome + ":\n" +
                       "--------------------------------------------------\n";
        for (Cliente c : listaClientes)
            lista += c.toString() + "------------------------------\n";
        return lista;
    }

    // -- Análise de vendas


    public ArrayList<Aeroporto> getTopOrigens() {
        /* Retorna uma lista das origens mais comuns.*/
        ArrayList<Integer> cont_odernada = new ArrayList<Integer>(listaAeroportos.size()), contagem = new ArrayList<Integer>(listaAeroportos.size());
        ArrayList<Aeroporto> ordenado = new ArrayList<Aeroporto>(listaAeroportos.size());
        
        int index, indice;

        //Conta quantas vezes cada Aeroporto apareceu
        for (Cliente cliente : listaClientes) {
            for (Passagem passagem : cliente.getHistoricoDeCompras()) {
                index = listaAeroportos.indexOf(passagem.getTrajeto().getInicio());
                contagem.set(index, contagem.get(index) + 1);
            }            
        }
        //Ordena uma cópia da lista de contagem
        for (int i = 0; i < contagem.size(); i++) {
            cont_odernada.set(i, contagem.get(i));
        }
        cont_odernada.sort(Collections.reverseOrder());

        //Preenche a lista de aeroportos mais visitados
        for (int i = 0; i < cont_odernada.size(); i++) {
            indice = contagem.indexOf(cont_odernada.get(i));
            ordenado.set(i, listaAeroportos.get(indice));
            contagem.set(indice, null);
        }

        return ordenado;
    }

    public String listarTopOrigens(int tam) {
        /* Retorna uma string com as origens mais comuns da companhia.*/
        ArrayList<Aeroporto> topOrigens = getTopOrigens();
        String lista = "Origens mais comuns:";
        for (int i = 0; i < tam; i++){
            lista = lista + "\n" + topOrigens.get(i).getCidade();
        }
        return lista;
    }

    public ArrayList<Aeroporto> getTopDestinos() {
        /* Retorna uma lista dos destinos mais comuns.*/
        ArrayList<Integer> cont_odernada = new ArrayList<Integer>(listaAeroportos.size()), contagem = new ArrayList<Integer>(listaAeroportos.size());
        ArrayList<Aeroporto> ordenado = new ArrayList<Aeroporto>(listaAeroportos.size());
        
        int index, indice;

        //Conta quantas vezes cada Aeroporto apareceu
        for (Cliente cliente : listaClientes) {
            for (Passagem passagem : cliente.getHistoricoDeCompras()) {
                index = listaAeroportos.indexOf(passagem.getTrajeto().getFim());
                contagem.set(index, contagem.get(index) + 1);
            }            
        }
        //Ordena uma cópia da lista de contagem
        for (int i = 0; i < contagem.size(); i++) {
            cont_odernada.set(i, contagem.get(i));
        }
        cont_odernada.sort(Collections.reverseOrder());

        //Preenche a lista de aeroportos mais visitados
        for (int i = 0; i < cont_odernada.size(); i++) {
            indice = contagem.indexOf(cont_odernada.get(i));
            ordenado.set(i, listaAeroportos.get(indice));
            contagem.set(indice, null);
        }

        return ordenado;
    }

    public String listarTopDestinos(int tam) {
        /* Retorna uma string com a lista dos destinos mais comuns da companhia.*/
        ArrayList<Aeroporto> topDestinos = getTopDestinos();
        String lista = "Destinos mais comuns:";
        for (int i = 0; i < tam; i++){
            lista = lista + "\n" + topDestinos.get(i).getCidade();
        }
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

    public ArrayList<Trajeto> calculaTrajetos(Aeroporto origem, Aeroporto destino) {
        ArrayList<Trajeto> trajetos = new ArrayList<Trajeto>();
        /* Calcula os possíveis trajetos para viajar da origem para o destino.
        Precisa levar em consideração:
            - As conexões entre aeroportos;
            - Se há aviões que têm espaço suficiente para alocar
        o combustível necessário para concluir os voos do trajeto;
            - Se há aviões da companhia disponíveis para realizar o trajeto
            - Muita coisa, scrr
        TODO: Implementar um algoritmo de grafos. */
        Map<Aeroporto, Boolean> foiVisitado = new HashMap<Aeroporto, Boolean>();
        for (Aeroporto a : listaAeroportos){
            foiVisitado.put(a, false);
        }
        Stack<Aeroporto> pilha = new Stack<Aeroporto>();
        pilha.push(origem);
        
        while (!pilha.isEmpty()){
            Aeroporto atual = pilha.pop();

            if(!foiVisitado.get(atual)){

                boolean check = false;
                for (Voo visit : atual.getListaVoos()){
                    if (!foiVisitado.get(visit.getDestino())){
                        check = true;
                    }
                }

                if (atual.getListaVoos().size() == 0 || check == false){
                    foiVisitado.put(atual, true);
                }


                if (atual.equals(destino)){
                    System.out.println("oi");
                    foiVisitado.put(atual, false);
                }

                for (Voo adj : atual.getListaVoos()){
                    if (!foiVisitado.get(adj.getDestino())){
                        pilha.push(adj.getDestino());
                    }
                }
            }

        }
        return trajetos;
    }
    
    public String listarTrajetos(Aeroporto origem, Aeroporto destino) {
        /* Retorna uma string com os possíveis trajetos para viajar da origem para o destino. */
        ArrayList<Trajeto> listaTrajetos = calculaTrajetos(origem, destino);
        if (listaTrajetos.size() == 0)
            return "A companhia " + this.getNome() + " não oferece trajetos entre " + origem.getNome() + " e " + destino.getNome() + ".\n";
        String lista = "--------------------------------------------------\n" +
                       "Trajetos entre " + origem.getNome() + " e " + destino.getNome() + ":\n" +
                       "--------------------------------------------------\n";
        for (Trajeto t : listaTrajetos)
            lista += t.toString() + "------------------------------\n";
        return lista;
    }

    @Override
    public String toString() {
        return "CNPJ: " + this.CNPJ + "\n" + 
               "Nome: " + this.nome + "\n";
    }
}
