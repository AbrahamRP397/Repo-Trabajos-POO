import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String numeroUno = JOptionPane.showInputDialog("Ingresa el primer numero");
        String numeroDos = JOptionPane.showInputDialog("Ingresa el segundo numero");
        String numeroTres = JOptionPane.showInputDialog("Ingresa el tercer numero");
        int suma =Integer.parseInt(numeroUno) + Integer.parseInt(numeroDos) + Integer.parseInt(numeroTres);
        float promedio = suma / 3;
        System.out.println("El pormedio es: " + promedio);
    }
}