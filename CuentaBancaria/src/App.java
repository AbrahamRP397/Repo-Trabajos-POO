import Model.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount ba = new BankAccount();
        ba.setHolder("Abraham");
        ba.deposit(1000);
        System.out.println("saldo: " + ba.getBalance());
        ba.withdraw(200);
        System.out.println("saldo: " + ba.getBalance());
        ba.withdraw(10000);
        System.out.println("saldo: " + ba.getBalance());
        System.out.println("Hasta pronto " + ba.getHolder());
    }
}
