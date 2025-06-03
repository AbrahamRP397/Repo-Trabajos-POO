import Model.*;

public class App {
    public static void main(String[] args) {
        Figure sq = new Square(5);
        Figure cir = new Circle(3);
        Figure isoscelesTri = new IsoscelesTriangle(4,5,6);
        Figure equilateralTri = new EquilateralTriangle(4);
        Figure scaleneTri = new ScaleneTriangle(7, 5, 4);

        Figure[] figures = {sq, cir, isoscelesTri, equilateralTri, scaleneTri};

        for (Figure figure : figures) {
            System.out.println(figure.getClass());
            System.out.println("Area: " + figure.getArea());
            System.out.println("Perimetro: " + figure.getPerimeter());
        }
    }
}
