import javax.swing.JOptionPane;
public class tarea24{
    public static void main(String[]args){
        int entero=0,sum;
        do{
            sum = Integer.parseInt(JOptionPane.showInputDialog("ingresa numeros entero, y para salir 0 "));
            entero += sum;
        }while (sum!= 0);
        JOptionPane.showMessageDialog(null, "los numeros sumados es de:" +entero);
    }
}
