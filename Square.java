package co.edu.sena;

public class Square
{
    private double side;

    public void setSide(double side)
    {
        this.side = side;
    }


    public double CalculateArea ()
    {
        return (side * side);
    }
}
