import javax.swing.*;  
public class Swing {  
    public static void main(String[] args) { 
        //criando uma instancia da frame que vai exibir os botões 
        JFrame frame = new JFrame();

        //Criando os botões                
        JButton cadastrar = new JButton("Cadastrar");
        JButton remover = new JButton("Remover");  
        JButton sair = new JButton("Sair");  
        

        //Setando os tamanhos dos botões
        cadastrar.setBounds(130,100,100, 40);
        remover.setBounds(130,200,100, 40); 
        sair.setBounds(130,300,100, 40); 

        //Adicionando o botão na frame (JFrame)
        frame.add(cadastrar);
        frame.add(remover);
        frame.add(sair);
        
        //Setando as características da frame     
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
    }  
}  