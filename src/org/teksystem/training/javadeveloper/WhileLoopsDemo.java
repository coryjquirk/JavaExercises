package org.teksystem.training.javadeveloper;

public class WhileLoopsDemo {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
            System.out.println(i + " Welcome to Java World");
            i++;
        }

        int x = 21, sum = 0;
        //note, the above is shorthand for writing int twice.
        do {
            //line will be printed even if condition is false
            sum += x;
            x--;
        } while (x>10);
        System.out.println("Summation: " + sum);

        int[] myInt = new int[100];

    }
}
