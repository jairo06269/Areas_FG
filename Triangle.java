package co.edu.sena;
public class Triangle
{
    private int base=0;
    private int height=0;
    public void setBase(int base)
    {
        this.base = base;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public int CalculateArea ()
  {
    return (base * height) /2;
  }
}
