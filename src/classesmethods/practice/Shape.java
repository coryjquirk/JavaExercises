package classesmethods.practice;

public abstract class Shape {

    private double width; // 0 default value
    private double height; // 0 default value
    private String name; // NULL default value
    protected abstract double area();
    protected abstract double volume();
    protected abstract double perimeter();
    public Shape() {

    }

    public Shape(double width, double height, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    // constructor overloading: declaring multiple constructors
    // as long as each constructor has unique parameter list
    // having two "Shape" constructors allows us to create multiple
    // object instances of a class, with different parameter lists.
    public Shape(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public void printMessage() {
        System.out.println("This is my 1st method");
    }

    public String returnMessage() {
        return "This is my 2nd method";
    }

    //"getter"
    public double getWidth() {
        return this.width;
    }

    //"setter"
    public void setWidth(double width) {
        this.width = width;
    }

    //"getter"
    public double getHeight() {
        return this.height;
    }

    //"setter"
    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return 2.0 * (this.width + this.height);
    }

    public double getArea() {
        return this.width * this.height;
    }
}
