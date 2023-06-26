import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;

public abstract class Escrita {
    
    public static void salvarDados() {
        
        
        File arqSaida = new File(".\\src\\saida.txt");
        try {
            arqSaida.delete();
            arqSaida.createNewFile();
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(arqSaida));
            saida.writeObject(Main.companhia);
            saida.close();
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
    
}
