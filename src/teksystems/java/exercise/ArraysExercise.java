package teksystems.java.exercise;

import java.lang.reflect.Array;

public class ArraysExercise {
    // Write a program that creates an array of integers with a length of 3.
    // Assign the values 1, 2, and 3 to the indexes. Print out each array element.
    static void intsLengthThree (){
        System.out.println("intsLengthThree(): ");
        int[] intArray = {1, 2, 3};
        for (int i = 0; i < intArray.length; i++){
            System.out.printf("Element at position %d: %d\n", i, intArray[i]);
        }

    }
    // Write a program that returns the middle element in an array.
    // Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
    static void middleElementOfArray(){
        System.out.println("middleElementOfArray(): ");
        int[] myArray = {13, 5, 7, 68, 2};
        int midElementPos = myArray.length/2;
        System.out.println("Middle element: " + myArray[midElementPos]);
    }

    // Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
    // Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    //
    //
    //Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
    //
    //
    //Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    //
    //
    //Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
    //
    //
    //Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
    //
    //
    //Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
    //
    //
    //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //
    //The smallest number is 0
    //
    //The biggest number is 13
    //
    //
    //
    //Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    public static void main(String[] args) {
        intsLengthThree();
        middleElementOfArray();
    }
}
