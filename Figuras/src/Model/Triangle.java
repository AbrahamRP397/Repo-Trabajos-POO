package Model;

public class Triangle {
    private double side;
    private double base;
    private double height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

     public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        return (2 * side) + base;
    }

    public double getArea() {
        return (base * height) / 2;
    }
}