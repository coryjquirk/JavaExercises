package org.teksystem.training.javadeveloper;

import java.util.Arrays;

public class ArraysCopyDemo {
    public static void main(String[] args) {

        int[] listOne = {1,2,3,4,5,6};
        int[] listTwo = listOne; //copying elements from listOne
        //listOne and listTwo are pointing to the same memory.
        listOne[5] = 100;
        System.out.println(Arrays.toString(listOne));
        System.out.println(Arrays.toString(listTwo));
        listTwo[5] = 99;
        System.out.println(Arrays.toString(listOne));
        System.out.println(Arrays.toString(listTwo));

        System.out.println("----copying array using loop----");
        int sourceArray[] = {1,2,3,4,5,6};
        int targetArray[] = new int[sourceArray.length];

        for(int i = 0; i < targetArray.length; i++)
        {
            targetArray[i] = sourceArray[i];
        }

        System.out.println("sourceArray: " + Arrays.toString(sourceArray));
        System.out.println("targetArray: " + Arrays.toString(targetArray));

        int[] cloneArray = sourceArray.clone();
        System.out.println("cloneArray: " + Arrays.toString(cloneArray));
        cloneArray[4] = 200;
        System.out.println("sourceArray after `cloneArray[4] = 200`: " + Arrays.toString(sourceArray));
        System.out.println("cloneArray after `cloneArray[4] = 200`: " + Arrays.toString(cloneArray));

        System.out.println("============== Arrays.arrayCopy-------------------");

        int[] list3 = {5,6,7,8,9,10};
        int[] list4 = Arrays.copyOf(list3, 20);
        System.out.println(Arrays.toString(list4) );

        list4[19] = 1000;
        System.out.println("After changes in list 4 ");
        System.out.println(Arrays.toString(list4));
        System.out.println(Arrays.toString(list3));

        long[] lValues = new long[500];
        Arrays.fill(lValues, 2057);
        System.out.println( Arrays.toString(lValues));
    }
}
