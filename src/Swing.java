import javax.swing.*;  
public class Swing {  
    public static void main(String[] args) { 
        //criando uma instancia da frame que vai exibir os botões 
        JFrame frame = new JFrame("MCVC");

        //Criando os botões                
        JButton cadastrar = new JButton("Cadastrar");
        //TODO Fazer uma lista de botoes com todas as cidades pra pessoa clicar em qual ela quer remover
        JButton remover = new JButton("Remover");
        JButton simular_compra = new JButton("Simular compra");
        JButton sair = new JButton("Sair");

        //Setando os tamanhos dos botões
        cadastrar.setBounds(100,100,170, 40);
        remover.setBounds(100,170,170, 40); 
        simular_compra.setBounds(100,240,170, 40);
        sair.setBounds(100, 310, 170, 40); 

        //Adicionando o botão na frame (JFrame)
        frame.add(cadastrar);
        frame.add(remover);
        frame.add(sair);
        frame.add(simular_compra);
        
        //Setando as características da frame     
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
    }  
}  