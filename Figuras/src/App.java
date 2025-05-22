import Model.Circle;
import Model.Square;
import Model.Triangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        Circle cir = new Circle();
        Triangle tri = new Triangle();

        double side, radio, base, height;
        String message;

        System.out.println("Ingresa un mensaje: ");
        message = sc.nextLine();
        sq.setMessage(message);
        System.out.println("Ingresa el lado del cuadrado: ");
        side = sc.nextDouble();
        sq.setside(side);
        System.out.println("El perimetro es: " + sq.getPerimeter());
        System.out.println("El area es: " + sq.getArea());

        System.out.println("Ingresa el radio del circulo");
        radio = sc.nextDouble();
        cir.setRadio(radio);
        System.out.println("El perimetro es:" + cir.getPerimeter());
        System.out.println("El area es:" + cir.getArea());

        System.out.println("Ingresa un lado del triangulo isosceles");
        side = sc.nextDouble();
        tri.setSide(side);
        System.out.println("Ingresa la base del triangulo isosceles: ");
        base = sc.nextDouble();
        tri.setBase(base);
        System.out.println("Ingresa la altura del triangulo isosceles: ");
        height = sc.nextDouble();
        tri.setHeight(height);
        System.out.println("El perimetro es:" + tri.getPerimeter());
        System.out.println("El area es:" + tri.getArea());

        sc.close();
    }
}
