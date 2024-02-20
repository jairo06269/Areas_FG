package co.edu.sena;
import java.util.Scanner;


public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int base ;
        int height ;

        Triangle triangle1 = new Triangle();
        System.out.println("ingrese numero de base");
        base = sc.nextInt();
        triangle1.setBase(base);

        System.out.println("ingrese numero de altura");
        height = sc.nextInt();
        triangle1.setHeight(height);

        System.out.println("el area del triangulo es de " + triangle1.CalculateArea());
    }

}
