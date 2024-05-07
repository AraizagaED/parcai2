import javax.swing.JOptionPane;
public class tarea25{
    public static void main(String[]args){
        String input = JOptionPane.showInputDialog("cuantos numeros quieres en la secuencia:");
        int limite = Integer.parseInt(input);
        int contador = 0 ,num1 = 0, num2 = 1;
        
        do{
            JOptionPane.showMessageDialog(null, num1);
            int suma = num1 +num2;
            num1 = num2;
            num2 = suma;
            contador++;
        }while (contador < limite);
        
        
    }
}
    
