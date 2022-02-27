package classesmethods.practice;

public abstract class Circle extends Shape implements DrawGraph{
//we can call/use more than 1 interface but cannot extend more than one class.
    final double PI = Math.PI;
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }


    @Override
    protected double area() {
        double areaResult = PI * Math.pow(this.radius, 2);
        return areaResult;
    }

    @Override
    protected double volume() {
        return 0;
    }

    @Override
    protected double perimeter() {
        return 0;
    }
}
