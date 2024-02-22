package co.edu.sena;

public class Circle
{
    double radius;
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double CalculateArea ()
    {
        return (radius * radius)* Math.PI ;
    }

}
