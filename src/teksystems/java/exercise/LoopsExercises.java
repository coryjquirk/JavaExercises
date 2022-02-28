package teksystems.java.exercise;

public class LoopsExercises {

    //Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
    static void tenLoop(){
        System.out.println("For loop printing 1-10: ");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    //Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.
    static void hundredLoop(){
        System.out.println("For loop printing 1-100 by tens: ");
        for (int i = 0; i <= 100; i++){
            if(i % 10 != 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
    //Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.
    static void doWhileTenLoop(){
        System.out.println("1-10 with do-while loop: ");
        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i > 0 && i < 10);
    }
    //Write a program that uses a for-loop to loop through the numbers 1-100.
    // Print out each number if is a multiple of 5, but do not print out any numbers between 25 and 75.
    // Use the “continue” statement to accomplish this.
    static void forLoopFivesSkip25to75(){
        System.out.println("forLoopFivesSkip25to75: ");
        for (int i = 0; i <= 100; i++){
            if (i % 5 == 0 && ((i <= 25) || (i >= 75))){
                System.out.println(i);
            }
        }
    }
    // Write a program that uses a for-loop to loop through the numbers 1-100.
    // Print out each number if is a multiple of 5, but do not print out any numbers greater than 50.
    // Use the “break” keyword to accomplish this.
    static void forLoopFivesSkipsFiftyPlus(){
        System.out.println("forLoopFivesSkipsFiftyPlus: ");
        for (int i = 0; i <= 100; i++){
            if(i > 50){
                break;
            } else if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
    //Write a program that uses nested for-loops to output the following:
    //Week 1:
    //Day 1
    //Day 2
    //Day 3
    //Day 4
    //Day 5
    //Week 2:
    //Day 1
    //Day 2
    //Day 3
    //Day 4
    //Day 5
    static void twoWorkWeeks(){
        System.out.println("twoWorkWeeks: ");
        for(int i = 1; i <= 2; i++){
            System.out.println("Week " + i + ":");
            for (int j = 1; j <= 5; j++){
                System.out.println("Day " + j);
            }
        }
    }

    //Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:
    //11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
    static void palindromeNums(){
        System.out.println("palindromeNums: ");
        // for loop that brings us from 10 to 200
        // convert number to string with valueOf()
        // new variable to store reversed string
        // determine equivalency between OG and reversed.
        // if equivalent, then print the original int.
        for (int i = 10; i <= 200; i++){
            String ogIntString = String.valueOf(i);
            String reversedString = new StringBuilder(ogIntString).reverse().toString();
            if (ogIntString.equals(reversedString)){
                System.out.println("Palindrome!");
                System.out.println(i);
            }
        }
    }
    //Write a program that prints the Fibonacci Sequence from 0 to 50.
    // The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
    static void Fibonacci() {
        System.out.println("~~~~Fibonacci function~~~~");
        int num1 = 0, num2 = 1;
        for (int counter = 0; counter <= 50; counter++){
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            if(num1 > 50){
                break;
            }
        }
    }
    // Write a program that nests a for-loop inside another.
    // Print out the inner and outer variable (e.g., i or j) in the inner
    // loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
    static void nestedForLoops(){
        System.out.println("===== Nested for loops up to 25 =====");
        for(int i = 0; i <= 25; i++){
            for (int j = 0; j <= 25; j++){
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }

    public static void main(String[] args) {
        tenLoop();
        hundredLoop();
        doWhileTenLoop();
        forLoopFivesSkip25to75();
        forLoopFivesSkipsFiftyPlus();
        twoWorkWeeks();
        palindromeNums();
        Fibonacci();
        nestedForLoops();
    }
}
