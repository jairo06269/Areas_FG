package co.edu.sena;
import java.util.Scanner;


public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)

    {
        int option;
        System.out.println("De que figura geometrica quiere calcular el area 1.Triangulo 2.Cuadrado 3.Circulo 4. Rectangulo");

        option = sc.nextInt();
        if (option < 1 || option > 4)
        {
            System.out.println("opcion no valida");
        }

        if (option == 1)
        {
            double base ;
            double height ;

            Triangle triangle1 = new Triangle();
            System.out.println("ingrese numero de base");
            base = sc.nextDouble();
            triangle1.setBase(base);

            System.out.println("ingrese numero de altura");
            height = sc.nextDouble();
            triangle1.setHeight(height);
            System.out.println("el area del triangulo es de " + triangle1.CalculateArea());
        }

        if (option == 2)
        {
            double side ;
            Square square1 = new Square();
            System.out.println("ingrese lado");
            side = sc.nextDouble();
            square1.setSide(side);
            System.out.println("el area del cuadrado es de " + square1.CalculateArea());

        }
        if (option == 3)
        {
            double radius ;
            Circle circle1 = new Circle();
            System.out.println("ingrese Radio");
            radius = sc.nextDouble();
            circle1.setRadius(radius);
            System.out.println("el area del circulo es de " + circle1.CalculateArea());

        }

        if (option == 4)
        {
            double sideA ;
            double sideB ;

            Rectangle rectangle1 = new Rectangle();
            System.out.println("ingrese medida primer lado");
            sideA = sc.nextDouble();
            rectangle1.setSideA(sideA);

            System.out.println("ingrese medida segundo lado");
            sideB = sc.nextDouble();
            rectangle1.setSideB(sideB);
            System.out.println("el area del rectangulo es de " + rectangle1.CalculateArea());
        }


    }

}
