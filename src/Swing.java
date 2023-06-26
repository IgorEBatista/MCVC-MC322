import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
class Swing implements ActionListener {
	static JFrame tela1;
	static JFrame tela2;
	static JFrame tela3;
	static JFrame tela4;
	static JFrame tela5;
	static JFrame tela6;
	static JFrame tela7;
	static JFrame tela8;
	static JButton cadastrar;
	static JButton remover;
	static JButton listar;
	static JButton simular_compra;
	static JButton sair;
	static JButton voltar;
	static JButton aeroporto2;
	static JButton aviao_cargueiro2;
	static JButton aviao_comercial2;
	static JButton carga2;
	static JButton clientePF2;
	static JButton clientePJ2;
	static JButton passageiro2;
	static JButton passagem2;
	static JButton trajeto2;
	static JButton voo2;
	static JButton aeroporto4;
	static JButton aviao_cargueiro4;
	static JButton aviao_comercial4;
	static JButton carga4;
	static JButton clientePF4;
	static JButton clientePJ4;
	static JButton passageiro4;
	static JButton passagem4;
	static JButton trajeto4;
	static JButton voo4;
	static JButton aeroporto6;
	static JButton aviao_cargueiro6;
	static JButton aviao_comercial6;
	static JButton carga6;
	static JButton clientePF6;
	static JButton clientePJ6;
	static JButton passageiro6;
	static JButton passagem6;
	static JButton trajeto6;
	static JButton voo6;
	static JButton calcular_trajetos;
	static JButton concluir_cadastro;
	static JButton concluir_remocao;
	JTextArea resumo_resposta;
	public static void main(String args[]){

		Main.main(args);

		//criando a tela1 (Menu principal)
		tela1 = new JFrame("MCVC - Menu");
		tela1.setSize(625, 600);
		tela1.setLayout(null);
		tela1.setBackground(Color.white);

		//criando o JLabel com a mensagem inicial
        JLabel texto1 = new JLabel("Seja bem-vindo ao sistema da MCVC!");  
		JLabel texto2 = new JLabel("Qual ação você deseja realizar?");  

        texto1.setBounds(20,10, 250,30); 
		texto2.setBounds(20,25, 200,30);     

		//criando os botões: cadastrar, remover, simular compra e sair
		cadastrar = new JButton("Cadastrar");
		remover = new JButton("Remover");
		listar = new JButton("Análise");
		simular_compra = new JButton("Simular compra");
		sair = new JButton("Sair");

		cadastrar.setBounds(75,100,200,50);
		listar.setBounds(75,175,200,50);
		remover.setBounds(75,250,200,50);
		simular_compra.setBounds(75,325,200,50);
		sair.setBounds(75,400,200,50);
		

		//adicionando o texto e os botões na tela1
		tela1.add(texto1);
		tela1.add(texto2);
		tela1.add(cadastrar);
		tela1.add(remover);
		tela1.add(listar);
		tela1.add(simular_compra);
		tela1.add(sair);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		cadastrar.addActionListener(obj);
		remover.addActionListener(obj);
		listar.addActionListener(obj);
		simular_compra.addActionListener(obj);
		sair.addActionListener(obj);

		//display tela1
		tela1.setVisible(true);
	}


	//função que cria a tela2
	public static void criar_tela2(){

		tela2 = new JFrame("MCVC - Cadastrar");
		tela2.setSize(625, 600);
		tela2.setLayout(null);
		tela2.setBackground(Color.white);
		JLabel texto1 = new JLabel("O que você deseja cadastrar?");  
        texto1.setBounds(20,10, 250,30); 


		//criando os botoes
		aeroporto2 = new JButton("Cadastrar Aeroporto"); 
		aviao_cargueiro2 = new JButton("Cadastrar Avião cargueiro"); 
		aviao_comercial2 = new JButton("Cadastrar Avião comercial"); 
		carga2 = new JButton("Cadastrar Carga");
		clientePF2 = new JButton("Cadastrar Cliente Pessoa Física"); 
		clientePJ2 = new JButton("Cadastrar Cliente Pessoa Jurídica"); 
		passageiro2 = new JButton("Cadastrar Passageiro"); 
		passagem2 = new JButton("Cadastrar Passagem");
		trajeto2 = new JButton("Cadastrar Trajeto"); 
		voo2 = new JButton("Cadastrar Voo"); 
		voltar = new JButton("Voltar"); 

		aeroporto2.setBounds(75,100,200,50);
		aviao_cargueiro2.setBounds(75,175,200,50);
		aviao_comercial2.setBounds(75,250,200,50);
		carga2.setBounds(75,325,200,50);
		clientePF2.setBounds(75,400,200,50);

		clientePJ2.setBounds(350,100,200,50);
		passageiro2.setBounds(350,175,200,50);
		passagem2.setBounds(350,250,200,50);
		trajeto2.setBounds(350,325,200,50);
		voo2.setBounds(350,400,200,50);
		voltar.setBounds(350,475,200,50);

		//Add the button to frame 2
		tela2.add(texto1);
		tela2.add(voltar);
		tela2.add(aeroporto2);
		tela2.add(aviao_cargueiro2);
		tela2.add(aviao_comercial2);
		tela2.add(carga2);
		tela2.add(clientePF2);
		tela2.add(clientePJ2);
		tela2.add(passageiro2);
		tela2.add(passagem2);
		tela2.add(trajeto2);
		tela2.add(voo2);
		tela2.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		aeroporto2.addActionListener(obj);
		aviao_cargueiro2.addActionListener(obj);
		aviao_comercial2.addActionListener(obj);
		carga2.addActionListener(obj);
		clientePF2.addActionListener(obj);
		clientePJ2.addActionListener(obj);
		passageiro2.addActionListener(obj);
		passagem2.addActionListener(obj);
		trajeto2.addActionListener(obj);
		voo2.addActionListener(obj);
		voltar.addActionListener(obj);
		
		//Display tela2
		tela2.setVisible(true);
	}

	public static void criar_tela3(){

		tela3 = new JFrame("MCVC - Remover");
		tela3.setSize(625, 600);
		tela3.setLayout(null);
		tela3.setBackground(Color.white);
		JLabel texto1 = new JLabel("O que você deseja remover?");  
        texto1.setBounds(20,10, 250,30); 

		//criando os botoes
		aeroporto2 = new JButton("Remover Aeroporto"); 
		aviao_cargueiro2 = new JButton("Remover Avião cargueiro"); 
		aviao_comercial2 = new JButton("Remover Avião comercial"); 
		carga2 = new JButton("Remover Carga");
		clientePF2 = new JButton("Remover Cliente Pessoa Física"); 
		clientePJ2 = new JButton("Remover Cliente Pessoa Jurídica"); 
		passageiro2 = new JButton("Remover Passageiro"); 
		passagem2 = new JButton("Remover Passagem");
		trajeto2 = new JButton("Remover Trajeto"); 
		voo2 = new JButton("Remover Voo"); 
		voltar = new JButton("Voltar"); 

		aeroporto2.setBounds(75,100,200,50);
		aviao_cargueiro2.setBounds(75,175,200,50);
		aviao_comercial2.setBounds(75,250,200,50);
		carga2.setBounds(75,325,200,50);
		clientePF2.setBounds(75,400,200,50);

		clientePJ2.setBounds(350,100,200,50);
		passageiro2.setBounds(350,175,200,50);
		passagem2.setBounds(350,250,200,50);
		trajeto2.setBounds(350,325,200,50);
		voo2.setBounds(350,400,200,50);
		voltar.setBounds(350,475,200,50);

		//adicionando os botoes na tela3
		tela3.add(texto1);
		tela3.add(voltar);
		tela3.add(aeroporto2);
		tela3.add(aviao_cargueiro2);
		tela3.add(aviao_comercial2);
		tela3.add(carga2);
		tela3.add(clientePF2);
		tela3.add(clientePJ2);
		tela3.add(passageiro2);
		tela3.add(passagem2);
		tela3.add(trajeto2);
		tela3.add(voo2);
		tela3.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		aeroporto2.addActionListener(obj);
		aviao_cargueiro2.addActionListener(obj);
		aviao_comercial2.addActionListener(obj);
		carga2.addActionListener(obj);
		clientePF2.addActionListener(obj);
		clientePJ2.addActionListener(obj);
		passageiro2.addActionListener(obj);
		passagem2.addActionListener(obj);
		trajeto2.addActionListener(obj);
		voo2.addActionListener(obj);
		voltar.addActionListener(obj);
		
		//Display tela3
		tela3.setVisible(true);
	}

	public static void criar_tela4(){
		tela4 = new JFrame("MCVC - Simular compra");
		tela4.setSize(625, 600);
		tela4.setLayout(null);
		tela4.setBackground(Color.white);

		//setando os textos (JLabels)
		JLabel texto1 = new JLabel("Vamos simular uma compra de passagem.");  
        texto1.setBounds(20,10, 250,30); 
		JLabel texto2 = new JLabel("Origem: ");  
        texto2.setBounds(50,75, 250,30);
		JLabel texto3 = new JLabel("Destino: ");  
        texto3.setBounds(50,150, 250,30);

		final JTextArea lista_trajetos_area = new JTextArea();    
		lista_trajetos_area.setEditable(false);      
		lista_trajetos_area.setBounds(350, 75, 200, 425);

		//TODO: adicionar a barra de rolagem (SrollPane)
  
		//Criando as ComboBoxes
		String[] origens = new String[Main.companhia.getNomeAeroportos().size()];
		origens = Main.companhia.getNomeAeroportos().toArray(origens);
		final JComboBox<String> origens_cb = new JComboBox<>(origens);  
		origens_cb.setBounds(50, 100,90,20);		

		String[] destinos = new String[Main.companhia.getNomeAeroportos().size()];
		destinos = Main.companhia.getNomeAeroportos().toArray(origens);
		final JComboBox<String> destinos_cb = new JComboBox<>(destinos); 
		destinos_cb.setBounds(50, 175,90,20);

		JButton calcular_trajetos = new JButton("Calcular trajetos");  
		calcular_trajetos.setBounds(50,250,200,50);  

		tela4.add(texto1);
		tela4.add(texto2);
		tela4.add(texto3);
		tela4.add(origens_cb); 
		tela4.add(destinos_cb);
		tela4.add(lista_trajetos_area); 
		tela4.add(calcular_trajetos);    
		tela4.setLayout(null);       
		tela4.setVisible(true);       


		calcular_trajetos.addActionListener (new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
			Aeroporto origem = Main.companhia.getlistaAeroportos().get(origens_cb.getSelectedIndex());
			Aeroporto dest = Main.companhia.getlistaAeroportos().get(destinos_cb.getSelectedIndex());
			ArrayList<Trajeto> trajetos = Main.companhia.calcularTrajetos(origem, dest);
			Collections.sort(trajetos);
			String lista_trajetos_str = "";
			for(Trajeto trajeto_iterado : trajetos){
				lista_trajetos_str += trajeto_iterado.toString();
			}
			lista_trajetos_area.setText(lista_trajetos_str);
			}  
		});
		
		//Display tela4
		tela4.setVisible(true);
	}

	public static void criar_tela5(){
		//TODO: fazer o cadastro funcionar - validação (a tela de confirmação aparece mesmo quando não digitamos nada)

		tela5 = new JFrame("MCVC - Cadastrar Aeroporto");
		tela5.setSize(1000, 600);
		tela5.setLayout(null);
		tela5.setBackground(Color.white);
		JLabel texto1 = new JLabel("Vamos cadastrar um novo Aeroporto");  
        texto1.setBounds(20,10, 250,30); 

		//criando os JTextField
		JTextField nome = new JTextField();
		JTextField coordenadas = new JTextField();
		JTextField cidade = new JTextField();
		JTextField largura_pista = new JTextField();

		nome.setBounds(100, 150, 200, 50);
		coordenadas.setBounds(100, 300, 200, 50);
		cidade.setBounds(500, 150, 200, 50);
		largura_pista.setBounds(500, 300, 200, 50);

		//criando os JLabels
		JLabel nome_label = new JLabel("Nome: ");
		JLabel coordenadas_label = new JLabel("Coordenadas: (latitude, longitude)");
		JLabel cidade_label = new JLabel("Cidade: ");
		JLabel largura_pista_label = new JLabel("Largura da pista de pouso: ");

		nome_label.setBounds(100, 100, 200, 50);
		coordenadas_label.setBounds(100, 250, 200, 50);
		cidade_label.setBounds(500, 100, 200, 50);
		largura_pista_label.setBounds(500, 250, 200, 50);

		//criando os botoes
		concluir_cadastro = new JButton("Concluir cadastro - Aeroporto"); 
		voltar = new JButton("Voltar"); 
		concluir_cadastro.setBounds(75,450,300,50);
		voltar.setBounds(450,450,300,50);

		//Add the button to frame 2
		tela5.add(texto1);
		tela5.add(concluir_cadastro);
		tela5.add(nome_label);
		tela5.add(coordenadas_label);
		tela5.add(cidade_label);
		tela5.add(largura_pista_label);
		tela5.add(nome);
		tela5.add(coordenadas);
		tela5.add(cidade);
		tela5.add(largura_pista);
		tela5.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		ArrayList<String> listaAeroporto = new ArrayList<String>();

		nome.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
			}  
		});
		coordenadas.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
			}  
		});
		cidade.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
			}  
		});
		largura_pista.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
			}  
		});

		concluir_cadastro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {    
				String largura_pista_str = largura_pista.getText();     
				String cidade_str = cidade.getText();  
				String coordenadas_str = coordenadas.getText();  
				String nome_str = nome.getText(); 

				if (largura_pista_str.equals("") || cidade_str.equals("") || coordenadas_str.equals("") || nome_str.equals("")){
					//TODO colocar erro na tela
				}
				else{
					listaAeroporto.add(nome_str);
					listaAeroporto.add(cidade_str);
					listaAeroporto.add(coordenadas_str.split(", ")[0]);
					listaAeroporto.add(coordenadas_str.split(", ")[1]);
					listaAeroporto.add(largura_pista_str);
					if (MenuCadastro.cadastrarAeroporto(listaAeroporto)){
						//TODO mensagem de cadastrado com sucesso
					};
				}
			}  
		});
		voltar.addActionListener(obj);
		
		voltar.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
				tela5.setVisible(false); 
			}  
		});

		//Display tela2
		tela5.setVisible(true);
	}

	public static void criar_tela6(){
		
		tela6 = new JFrame("MCVC - Análise");
		tela6.setSize(625, 600);
		tela6.setLayout(null);
		tela6.setBackground(Color.white);
		JLabel texto1 = new JLabel("O que você deseja analisar?");  
        texto1.setBounds(20,10, 250,30); 

		//criando os botoes
		JButton resumo = new JButton("Principais informações");
		aeroporto6 = new JButton("Listar Aeroportos"); 
		aviao_cargueiro6 = new JButton("Listar Aviões Cargueiros"); 
		aviao_comercial6 = new JButton("Listar aviões Comerciais"); 
		carga6 = new JButton("Listar Cargas");
		clientePF6 = new JButton("Listar Clientes Pessoa Física"); 
		clientePJ6 = new JButton("Listar Clientes Pessoa Jurídica"); 
		passageiro6 = new JButton("Listar Passageiros"); 
		passagem6 = new JButton("Listar Passagens");
		trajeto6 = new JButton("Listar Trajetos"); 
		voo6 = new JButton("Listar Voos"); 
		voltar = new JButton("Voltar"); 

		aeroporto6.setBounds(75,100,200,50);
		aviao_cargueiro6.setBounds(75,175,200,50);
		aviao_comercial6.setBounds(75,250,200,50);
		carga6.setBounds(75,325,200,50);
		clientePF6.setBounds(75,400,200,50);
		resumo.setBounds(75,475,200,50);

		clientePJ6.setBounds(350,100,200,50);
		passageiro6.setBounds(350,175,200,50);
		passagem6.setBounds(350,250,200,50);
		trajeto6.setBounds(350,325,200,50);
		voo6.setBounds(350,400,200,50);
		voltar.setBounds(350,475,200,50);

		// resumo_resposta.setBounds(75, 375, 200, 200);

		//Add the button to frame 2
		tela6.add(texto1);
		tela6.add(aeroporto6);
		tela6.add(aviao_cargueiro6);
		tela6.add(aviao_comercial6);
		tela6.add(carga6);
		tela6.add(clientePF6);
		tela6.add(clientePJ6);
		tela6.add(passageiro6);
		tela6.add(passagem6);
		tela6.add(trajeto6);
		tela6.add(voo6);
		tela6.add(resumo);
		tela6.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		aeroporto6.addActionListener(obj);
		aviao_cargueiro6.addActionListener(obj);
		aviao_comercial6.addActionListener(obj);
		carga6.addActionListener(obj);
		clientePF6.addActionListener(obj);
		clientePJ6.addActionListener(obj);
		passageiro6.addActionListener(obj);
		passagem6.addActionListener(obj);
		trajeto6.addActionListener(obj);
		voo6.addActionListener(obj);
		resumo.addActionListener(obj);
		voltar.addActionListener(obj);
		
		//Display tela6
		tela6.setVisible(true);
	}

	public static void criar_tela7(){

		tela7 = new JFrame("MCVC - Principais informações");
		tela7.setSize(625, 600);
		tela7.setLayout(null);
		tela7.setBackground(Color.white);
		JLabel texto1 = new JLabel("Principais informações: ");  
        texto1.setBounds(20,10, 250,30); 

		JTextArea resumo_resposta;
		resumo_resposta = new JTextArea(MenuAnalise.resumirInfos());
		resumo_resposta.setEditable(false);

		//criando os botoes
		voltar = new JButton("Voltar"); 

		voltar.setBounds(350,475,200,50);
		resumo_resposta.setBounds(75, 75, 200, 200);

		//Add the button to frame 2
		tela7.add(resumo_resposta);
		tela7.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		voltar.addActionListener(obj);
		
		//Display tela7
		tela7.setVisible(true);
	}
	public static void criar_tela8(){

		tela8 = new JFrame("MCVC - Listar Aeroportos");
		tela8.setSize(625, 600);
		tela8.setLayout(null);
		tela8.setBackground(Color.white);
		tela8.getContentPane().setLayout(new FlowLayout());
		JLabel texto1 = new JLabel("Lista de Aeroportos: ");  
        texto1.setBounds(20,10, 250,30); 
		tela8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela8.getContentPane().setLayout(new FlowLayout());   

		JTextArea resumo_resposta;
		resumo_resposta = new JTextArea(75, 75);
		resumo_resposta.setText(MenuAnalise.listarAeroportos());
		resumo_resposta.setEditable(false);

		//criando a Scroll bar
		// TODO : fazer a scrollbar funcionar pelo amor de Deus
		JScrollPane scroll = new JScrollPane(resumo_resposta); 
		scroll.setBounds(500,75, 50,400);  
		tela8.getContentPane().add(scroll);

		//criando os botoes
		voltar = new JButton("Voltar"); 

		voltar.setBounds(350,475,200,50);
		// resumo_resposta.setBounds(75, 75, 475, 400);

		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		//Add the button to frame 2
		tela8.add(resumo_resposta);
        tela8.getContentPane().add(scroll);  
		tela8.add(voltar);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		voltar.addActionListener(obj);
		
		//Display tela8
		tela8.setVisible(true);
	}
	
	//função que vai fazer coisas quando os botões forem clicados
	public void actionPerformed(ActionEvent e){
		String button = e.getActionCommand();
		if(button.equals("Cadastrar")){
			criar_tela2();
		}

		if(button.equals("Remover")){
			criar_tela3();
		}

		if(button.equals("Análise")){
			criar_tela6();
		}

		if(button.equals("Simular compra")){
			criar_tela4();
		}

		if(button.equals("Sair")){
			tela1.dispose();
			Escrita.salvarDados();
		}

		if(button.equals("Voltar")){
			if (tela8 != null && tela8.isVisible()){
				tela8.dispose();
			}
			else if (tela7 != null && tela7.isVisible()){
				tela7.dispose();
			}
			else if (tela6 != null && tela6.isVisible()){
				tela6.dispose();
			}			
			else if (tela5 != null && tela5.isVisible()){
				tela5.dispose();
			} 
			else if (tela4 != null && tela4.isVisible()){
				tela4.dispose();
			} 
			else if (tela3 != null && tela3.isVisible()){
				tela3.dispose();
			} 
			else if (tela2 != null && tela2.isVisible()){
				tela2.dispose();
			}
		}

		if(button.equals("Cadastrar Aeroporto")){
			criar_tela5();
		}
		if(button.equals("Concluir cadastro - Aeroporto")){
			JOptionPane.showMessageDialog(tela5, "Aeroporto cadastrado com sucesso!");
		}

		if(button.equals("Remover Aeroporto")){
			// TODO: se der tempo: fazer uma página de remoção

		}

		if(button.equals("Listar Aeroportos")){
			javax.swing.SwingUtilities.invokeLater(new Runnable() {  
				public void run() {  
					criar_tela8();  
				}  
        }); 
		}
		if(button.equals("Principais informações")){
			//TODO: fazer o textArea com o return da resumirInfos
			criar_tela7();
		}
	}
}




// import javax.swing.*;
// import java.awt.event.*;  

// public class Swing {  
//     public static void main(String[] args) { 
//         //criando uma instancia da frame que vai exibir os botões 
//         JFrame frame = new JFrame("MCVC - login");

//         //setando o JLabel que vai ter o "senha:"
//         final JLabel label = new JLabel();            
//         label.setBounds(20,150, 200,50); 
        
//         //criando o espaço em que a senha será digitada
//         final JPasswordField senha_PasswordField = new JPasswordField();   
//         senha_PasswordField.setBounds(100,75,100,30);

//         JLabel usuario_JLabel = new JLabel("Username:");    
//         usuario_JLabel.setBounds(20,20, 80,30);    
//         JLabel senha_JLabel = new JLabel("Password:");    
//         senha_JLabel.setBounds(20,75, 80,30); 

//         JButton login = new JButton("Fazer login");  
//         login.setBounds(100,120, 80,30);

//         final JTextField usuario_Field = new JTextField();  
//         usuario_Field.setBounds(100,20, 100,30); 

//         frame.add(senha_PasswordField);
//         frame.add(usuario_Field);
//         frame.add(label);
//         frame.add(senha_JLabel);
//         frame.add(login);
//         frame.add(usuario_Field);  
//         frame.setSize(300,300);    
//         frame.setLayout(null);    
//         frame.setVisible(true);     
//         login.addActionListener(new ActionListener() {  
//         public void actionPerformed(ActionEvent e) {       
//             String data = "Username " + usuario_Field.getText();  
//             data += ", Password: "   
//             + new String(senha_PasswordField.getPassword());   
//             label.setText(data);          
//         }  
//         });   

        // //Criando os botões                
        // JButton cadastrar = new JButton("Cadastrar");
        // // Fazer uma lista de botoes com todas as cidades pra pessoa clicar em qual ela quer remover
        // JButton remover = new JButton("Remover");
        // JButton simular_compra = new JButton("Simular compra");
        // JButton sair = new JButton("Sair");

        // //Setando os tamanhos dos botões
        // cadastrar.setBounds(100,100,170, 40);
        // remover.setBounds(100,170,170, 40); 
        // simular_compra.setBounds(100,240,170, 40);
        // sair.setBounds(100, 310, 170, 40); 

        // //Adicionando o botão na frame (JFrame)
        // frame.add(cadastrar);
        // frame.add(remover);
        // frame.add(sair);
        // frame.add(simular_compra);
        
        // //Setando as características da frame     
        // frame.setSize(400,500);  
        // frame.setLayout(null);//using no layout managers  
        // frame.setVisible(true);//making the frame visible  
//     }  
// }  