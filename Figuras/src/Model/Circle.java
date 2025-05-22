package Model;

public class Circle {
    private final double PI = 3.1416;

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimeter() {
        return 2 * PI * radio;
    }

    public double getArea() {
        return PI * (radio * radio);
    }
}
