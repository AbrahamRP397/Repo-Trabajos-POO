package Model;

public class IsoscelesTriangle extends Figure {
    private double side;
    private double base;
    private double height;

    public IsoscelesTriangle(double side, double base, double height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

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

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return (2 * side) + base;
    }

    
}
