package org.teksystem.training.javadeveloper;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        // reverse array
        // e.g. [1,2,3,4,5,6,7,8,9,10]=>[10,9,8,7,6,5,4,3,2,1]
        int[] reverseThis = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array: " + Arrays.toString(reverseThis));
        int[] targetArray = new int[reverseThis.length];
        int j = -1;
        for(int i = reverseThis.length - 1; i >= 0; i--){
            j++;
            targetArray[j] = reverseThis[i];
        }
        System.out.println("Reversed array: " + Arrays.toString(targetArray));
    }
}
