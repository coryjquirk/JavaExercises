package classesmethods.practice;

public class Runnable {
    public static void main(String[] args)
    {
//        Circle c = new Circle(100);
//        System.out.println("Circle Area: " + c.area());

        Rectangle r = new Rectangle(200,36);
        System.out.println("Rectangle Area: " +  r.area());

        r.setHeight(5);
        r.setWidth(10);

        System.out.println("Rectangle Area: " +  r.area());
    }
}