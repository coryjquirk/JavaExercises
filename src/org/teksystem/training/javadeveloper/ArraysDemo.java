package org.teksystem.training.javadeveloper;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++){
            System.out.print("At index " + i + "--> ");
            System.out.println(myArray[i] = 10 + i);
        }

        System.out.println(Arrays.toString(myArray));

    }
}
