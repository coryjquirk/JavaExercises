package classesmethods.practice;

public class MethodOverloading {
    private int a;
    private int b;
    private int c;
    private double result;

    public MethodOverloading()
    {

    }

    public MethodOverloading(int a, int b, int c)
    {

    }

    public void addingnumber()
    {

    }

    // two arg
    public void addingnumber(int a, int b)
    {
        this.result = a + b;
    }

    public double getResult()
    {
        return this.result;
    }
    public void addingnumber(double a, int b)
    {

    }
    public void addingnumber(double a, double b)
    {

    }

    public void addingnumber(int a, int b, int c)
    {

    }

}
