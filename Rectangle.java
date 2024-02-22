package co.edu.sena;

public class Rectangle
{
    private double sideA;
    private double sideB;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double CalculateArea ()
    {
        return (sideA * sideB);
    }
}
