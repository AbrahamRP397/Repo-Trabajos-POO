package Model;

public class SecureUser {
    private String userName;
    private String password;

    public void setUserName(String userName) {
        if (userName.isEmpty() || userName == null) {
            System.out.println("Error: nombre vacio");
        } else {
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        boolean mayus = false, minus = false, digit = false;
        int ascii;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                ascii = (int) password.charAt(i);
                if (ascii >= 65 && ascii <= 90) {
                    mayus = true;
                }
                if (ascii >= 97 && ascii <= 122) {
                    minus = true;
                }
                if (ascii >= 48 && ascii <= 57) {
                    digit = true;
                }
            }
        } else {
            System.out.println("La contraseña debe de tener por lo menoos 8 caracteres");
        }

        if (mayus == true && minus == true && digit == true) {
            this.password = password;
        } else if (!mayus) {
            System.out.println("Ingresa por lo menos una letra Mayuscula");
        } else if (!minus) {
            System.out.println("Ingresa por lo menos una letra Minuscula");
        } else if (!digit) {
            System.out.println("Ingresa por lo menos un Numero");
        }
    }

    public boolean authenticate(String intPassword) {

        if (password.equals(intPassword)) {
            System.out.println("Autenticacion exitosa");
            return true;
        } else {
            System.out.println("Contraseña incorrecta");
            return false;
        }
    }

    public boolean validate() {
        return userName == null || userName.isEmpty() || password == null || password.isEmpty();
    }

}
