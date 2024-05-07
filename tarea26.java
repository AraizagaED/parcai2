import javax.swing.JOptionPane;

public class tarea26 {
    public static void main(String [] args) {
        
        int a = 0;
        String b = "";
        while (a<256) {
            b += a +": " + (char) a + "\n";
            a++;
            
        }
        JOptionPane.showMessageDialog(null, b);

    }
}
