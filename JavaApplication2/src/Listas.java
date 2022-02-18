
import javax.swing.JOptionPane;

/**
 *
 * @author ian
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        float a = (float)9;
        a += 8;
        a += 9;
        float d = (float) (a/3.0);
        if (d >= 9){
            System.out.println("Conceito A");
        } else if (d >= 8){
            System.out.println("Conceito B");
        } else if (d >= 7){
            System.out.println("Conceito D");
        } else if (d >= 6){
            System.out.println("Conceito F");
        } else if (d < 6){
            System.out.println("Conceito F");
        }
        
        System.out.println(d);
    }
    
}
