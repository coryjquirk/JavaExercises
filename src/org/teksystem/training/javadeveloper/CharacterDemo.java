package org.teksystem.training.javadeveloper;

public class CharacterDemo {
    public static void main(String[] args) {
        Character Obj1 = 'B';
        Character Obj2 = 'C';
        System.out.println("---------");

        int result = Obj1.compareTo(Obj2);
        System.out.println(result);

        boolean result2 = Obj1.equals(Obj2);
        System.out.println(result2);


        System.out.println(Obj2.isDigit(Obj1));
    }
}
