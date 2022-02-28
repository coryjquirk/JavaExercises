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
        for(int palindrome = 10; palindrome < 201; palindrome++){
            String intStr = String.valueOf(palindrome);
            System.out.println(intStr);
            // reverse intStr, store it as a variable,
            // compare reversed string with intStr
            // print if they're equal
            for (int i = 0; i < intStr.length(); i++){
                System.out.println("i: " + i);
                System.out.println("char at i: " + intStr.charAt(i));
            }
            for (int j = intStr.length() - 1; j >= 0; j--){
                System.out.println("j: " + j);
                System.out.println("char at j: " + intStr.charAt(j));
            }
        }
    }

    //
    //
    //Write a program that prints the Fibonacci Sequence from 0 to 50. The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
    //
    //
    //Write a program that nests a for-loop inside another. Print out the inner and outer variable (e.g., i or j) in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
    public static void main(String[] args) {
        tenLoop();
        hundredLoop();
        doWhileTenLoop();
        forLoopFivesSkip25to75();
        forLoopFivesSkipsFiftyPlus();
        twoWorkWeeks();
        palindromeNums();
    }
}
