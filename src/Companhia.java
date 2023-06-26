import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Companhia implements Serializable{
    // Atributos (Propriedades)
    private final String CNPJ;
    private String nome;
    private ArrayList<Aeroporto> listaAeroportos;     // Lista de cidades em que a companhia atua
    private ArrayList<Aviao> listaAvioes;       // Lista de aviões da companhia
    private ArrayList<Cliente> listaClientes;   // Lista de clientes cadastrados na companhia
    private int limiteEscalas;
    
    // Construtor
    public Companhia(String CNPJ, String nome, int limiteEscalas) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.listaAeroportos = new ArrayList<Aeroporto>();
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

    public ArrayList<String> getNomeAeroportos(){

        ArrayList<String> nomes = new ArrayList<String>();
        for (Aeroporto a : listaAeroportos){
            nomes.add(a.getNome());
        }
        return nomes;
    }
    
    public void setlistaAeroportos(ArrayList<Aeroporto> listaAeroportos) {
        this.listaAeroportos = listaAeroportos;
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

    public Aviao buscarAviao(int serie) {
        /* Busca, na lista de aviões, o avião que tem o número de série
        dado como parâmetro.
        Retorna o avião se ele estiver na lista.
        Caso contrário, retorna null. */
        for (Aviao a: listaAvioes) 
            if (a.getSerie() == serie )
                return a;
        return null;
    }
    public Aviao buscarAviao(String serie) {
        return buscarAviao(Integer.parseInt(serie));
    }

    public String listarAvioes() {
        /* Retorna uma string com os aviões que a companhia possui. */
        if (listaAvioes.size() == 0)
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

    public ArrayList<Aeroporto> getAeroportos(ArrayList<Voo> voos){
        ArrayList<Aeroporto> aeroportos = new ArrayList<Aeroporto>();
        for (Voo v : voos){
            aeroportos.add(v.getDestino());
        }
        return aeroportos;
    }
    

    public ArrayList<Trajeto> calcularTrajetos(Aeroporto source, Aeroporto destination) {
        // verifica todos os caminhos
        Map<Aeroporto, Boolean> foiVisitado = new HashMap<Aeroporto, Boolean>();
        for (Aeroporto a : listaAeroportos){
            foiVisitado.put(a, false);
        }
        ArrayList<Trajeto> saida = new ArrayList<Trajeto>();
        ArrayList<Aeroporto> caminho = new ArrayList<Aeroporto>();
        caminho.add(source);

        verificarCaminhos(saida, source, destination, foiVisitado, caminho, 0);
        Collections.sort(saida);
        return saida;
    }

    private void verificarCaminhos(ArrayList<Trajeto> saida, Aeroporto current, 
    Aeroporto destination, Map<Aeroporto, Boolean> foiVisitado, ArrayList<Aeroporto> caminho, int profundidade) {
        // verifica todos os caminhos recursivamente
        foiVisitado.put(current, true);

        if (current == destination) {
            Trajeto trajeto = new Trajeto(new ArrayList<Aeroporto>(caminho));

            boolean jaExiste = true;
            for (Trajeto tr : saida){
                jaExiste = true;
                for (int i = 0; i < tr.getRota().size(); i++){
                    if (!(trajeto.getRota().get(i).getNome().equals(tr.getRota().get(i).getNome()))){
                        jaExiste = false;
                        break;
                    }
                }
            }
            if (!jaExiste || saida.size() == 0){
                saida.add(trajeto);
            }

        } else if (profundidade < limiteEscalas) {

            ArrayList<Aeroporto> adjacentes = getAeroportos(current.getListaVoos());
            for (Aeroporto adj : adjacentes) {
                if (!foiVisitado.get(adj)) {
                    // Verificar se o nó já está presente no caminho atual para evitar ciclos
                    if (!caminho.contains(adj)) {
                        caminho.add(adj);
                        verificarCaminhos(saida, adj, destination, foiVisitado, caminho, profundidade + 1);
                        caminho.remove(adj);
                    }
                }
            }
        }

        foiVisitado.put(current, false);
    }

    public String listarTrajetos(Aeroporto origem, Aeroporto destino) {
        /* Retorna uma string com os possíveis trajetos para viajar da origem para o destino. */
        ArrayList<Trajeto> listaTrajetos = new ArrayList<Trajeto>();

        listaTrajetos = calcularTrajetos(origem, destino);
        Collections.sort(listaTrajetos); // Organizando os trajetos com base em distância

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
