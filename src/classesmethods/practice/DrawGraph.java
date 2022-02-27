package classesmethods.practice;

public interface DrawGraph {
    // interface contains variables but variables are public, static, final by default
    String Name = "MyShape"; // by default: public, static, final.

    void drawShape(String color);
    void drawOn_Xaxis(int x);
    void drawOn_Yaxis(int y);

    //interfaces contain only abstract methods
    // abstract methods by default are public and abstract
}
