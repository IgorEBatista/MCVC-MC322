import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
class Swing implements ActionListener {
	static JFrame tela1;
	static JFrame tela2;
	static JFrame tela3;
	static JFrame tela4;
	static JFrame tela5;
	static JButton cadastrar;
	static JButton remover;
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
	static JButton calcular_trajetos;
	static JButton concluir_cadastro;
	static JButton concluir_remocao;

	public static void main(String args[]){

		//criando a tela1 (Menu principal)
		tela1 = new JFrame("MCVC - Menu");
		tela1.setSize(1000, 600);
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
		simular_compra = new JButton("Simular compra");
		sair = new JButton("Sair");

		cadastrar.setBounds(75,100,200,50);
		remover.setBounds(75,175,200,50);
		simular_compra.setBounds(75,250,200,50);
		sair.setBounds(75,325,200,50);

		//adicionando o texto e os botões na tela1
		tela1.add(texto1);
		tela1.add(texto2);
		tela1.add(cadastrar);
		tela1.add(remover);
		tela1.add(simular_compra);
		tela1.add(sair);

		//criando um objeto
		Swing obj = new Swing();

		//associando o ActionListener com os botões
		cadastrar.addActionListener(obj);
		remover.addActionListener(obj);
		simular_compra.addActionListener(obj);
		sair.addActionListener(obj);

		//display tela1
		tela1.setVisible(true);
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

		if(button.equals("Simular compra")){
			criar_tela4();
		}

		if(button.equals("Sair")){
			tela1.dispose();
		}

		if(button.equals("Voltar")){
			if (tela5 != null && tela5.isVisible()){
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

		}
		if(button.equals("Listar Aeroportos")){

		}
	}

	//função que cria a tela2
	public static void criar_tela2(){

		tela2 = new JFrame("MCVC - Cadastrar");
		tela2.setSize(1000, 600);
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
		tela3.setSize(1000, 600);
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
		tela4.setSize(1000, 600);
		tela4.setLayout(null);
		tela4.setBackground(Color.white);

		//setando os textos (JLabels)
		JLabel texto1 = new JLabel("Vamos simular uma compra de passagem.");  
        texto1.setBounds(20,10, 250,30); 
		JLabel texto2 = new JLabel("Origem: ");  
        texto2.setBounds(50,75, 250,30);
		JLabel texto3 = new JLabel("Destino: ");  
        texto3.setBounds(50,150, 250,30);

		final JLabel label = new JLabel();          
		label.setHorizontalAlignment(JLabel.CENTER);  
		label.setSize(400,100); 
  
		//Criando as ComboBoxes
		String origens[]={"C","C++","C#","Java","PHP"};        
		final JComboBox<String> origens_cb = new JComboBox<>(origens);  
		origens_cb.setBounds(50, 100,90,20);    

		String destinos[]={"C","C++","C#","Java","PHP"};        
		final JComboBox<String> destinos_cb = new JComboBox<>(destinos); 
		destinos_cb.setBounds(50, 175,90,20);    

		JButton calcular_trajetos = new JButton("Calcular trajetos");  
		calcular_trajetos.setBounds(50,250,200,50);  

		tela4.add(texto1);
		tela4.add(texto2);
		tela4.add(texto3);
		tela4.add(origens_cb); 
		tela4.add(destinos_cb);
		tela4.add(label); 
		tela4.add(calcular_trajetos);    
		tela4.setLayout(null);    
		tela4.setSize(350,350);    
		tela4.setVisible(true);       
		// calcular_trajetos.addActionListener (new ActionListener() {  
		// 	//TODO: chamar a função que calcula o trajeto de acordo com a origem e o destino
		// 	public void actionPerformed(ActionEvent e) {       
		// 	String data = "Programming language Selected: " + cb.getItemAt(cb.getSelectedIndex());  
		// 	label.setText(data);  
		// 	}  
		// });           
		
		//Display tela4
		tela4.setVisible(true);
	}

	public static void criar_tela5(){

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
		JLabel coordenadas_label = new JLabel("coordenadass: ");
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
		ArrayList<Object> listaAeroporto = new ArrayList<Object>();

		nome.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String nome_str = nome.getText();
				Integer.parseInt(nome_str);  
				listaAeroporto.add(nome_str);  
			}  
		});
		coordenadas.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String coordenadas_str = coordenadas.getText();  
				listaAeroporto.add(coordenadas_str);  
			}  
		});
		cidade.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String cidade_str = cidade.getText();  
				listaAeroporto.add(cidade_str);  
			}  
		});
		largura_pista.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {       
				String largura_pista_str = largura_pista.getText();  
				listaAeroporto.add(largura_pista_str);  
			}  
		});

		concluir_cadastro.addActionListener(obj);
		voltar.addActionListener(obj);

		MenuCadastro.cadastrarAeroporto(listaAeroporto);
		
		//Display tela2
		tela5.setVisible(true);
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