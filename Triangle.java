package co.edu.sena;
public class Triangle
{
    private double base=0;
    private double height=0;
    public void setBase(double base)
    {
        this.base = base;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double CalculateArea ()
  {
    return (base * height) /2;
  }
}
