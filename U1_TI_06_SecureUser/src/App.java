import java.util.Scanner;
import Model.SecureUser;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SecureUser su = new SecureUser();

        System.out.println("Ingresa tu nombre: ");
        String name = sc.next();
        su.setUserName(name);
        System.out.println("Ingresa una contraseña:");
        String password = sc.next();
        su.setPassword(password);
        if (su.validate()) {
            System.out.println("Usuario no inicializado correctamente");
        } else {
            System.out.println("===============================");
            System.out.println("Autenticación");
            System.out.println("Ingresa tu contraseña");
            String intPassword = sc.next();
            System.out.println(su.authenticate(intPassword));
        }
    }
}
