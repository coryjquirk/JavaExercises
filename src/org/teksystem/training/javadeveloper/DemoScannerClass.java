package org.teksystem.training.javadeveloper;
import java.util.Scanner;

public class DemoScannerClass {
    public static void main(String[] args) {
        //create object of scanner
        System.out.println("Enter your name");
        Scanner nameScanner = new Scanner(System.in);
        String theName = nameScanner.nextLine();
        System.out.println("Your name: " + theName);

        System.out.println("Enter your age");
        Scanner ageScanner = new Scanner(System.in);
        int theAge = ageScanner.nextInt();
        System.out.println("Your age: " + theAge);
    }
}
