package org.teksystem.training.javadeveloper;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i+=2){
            System.out.println(i + " hello world");
        }

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                for (int k = 1; k <= 3; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }

        for (int i = 4; i >= 0; i--){
            System.out.println();
            for (int j = i; j <= 4; j++){
                System.out.print("* ");
            }
        }
        System.out.println();

        //take number from user input and verify prime or non-prime#
        Scanner scanNum = new Scanner(System.in);
        boolean isPrime = true;
        int numInput = scanNum.nextInt();

        if( numInput != 1) {
            for (int i = 2; i <= numInput / 2; ++i) {
                // condition for nonprime number
                if (numInput % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        if (!isPrime){
            System.out.println("Not a prime number");
        } else {
            System.out.println("Prime number");
        }

        ///////////////////////////////////
        for(int i = 0; i < 10; i ++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}
