package Model;

public class BankAccount {
    private String holder;
    private double balance;

    public String getHolder() {
        return holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Operación exitosa");
        } else {
            System.out.println("Operación fallida: Debes ingresar un monto válido");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Operación exitosa");
            return true;
        } else {
            System.out.println("Operación fallida: Saldo insuficiente");
        }
        return false;
    }
}
