package classesmethods.practice;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle()
    {

    }
    public  Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }

    @Override
    protected double area() {
        double areaResult =  this.width * this.height;
        return  areaResult;
    }

    @Override
    protected double volume() {
        return 0;
    }

    @Override
    protected double perimeter() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
