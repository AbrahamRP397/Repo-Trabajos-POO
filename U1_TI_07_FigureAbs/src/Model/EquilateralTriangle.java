package Model;

public class EquilateralTriangle extends Figure{
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((Math.sqrt(3) / 4) * side * side );
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }
}
