package poly.demo;

public class MainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // animal obj
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}
