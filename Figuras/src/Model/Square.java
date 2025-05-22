package Model;

public class Square {

    private double side;
    private String message;

    public void setside(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        if (!message.isEmpty()) {
            getSecretMessage();
        }
        return side * side;
    }

    private void getSecretMessage() {
        System.out.println("Este metodo solo es accesible dentro de esta clse, pero no desde otra");
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
