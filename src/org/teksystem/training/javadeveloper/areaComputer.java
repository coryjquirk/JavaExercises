package org.teksystem.training.javadeveloper;

public class areaComputer {
    /**
     * Main method
     */
    public static void main(String[] args) {
        double radius;
        // Assign a radius
        radius = 20;

        // Compute area
        double area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);

        //--constant

        final double PI = 3.14;
        final int myssn = 1452;
        System.out.println(myssn);

        //only whole numbers
        byte byteVar = 5;
        short shortVar = 20;
        int myInt = 500;
        long longVar = 45635l;
        float floatVar = 256.365f;
        float floatVar2 = 25 / 10;

        double doubleVar = 2365.215;
        double doubleVar2 = 355 / 555;

        char mychar = 'D';
        char mychar2 = '\u0058';
        System.out.println(mychar2);
        char mychar3 = '\u0059';
        System.out.println(mychar3);
        char mychar4 = '\u0060';
        System.out.println(mychar4);
        char mychar5 = '\u0061';
        System.out.println(mychar5);

        boolean boolVar = true;
        System.out.println(boolVar);
        boolean boolVar2 = false;
        System.out.println(boolVar2);

        //widening or automatic type conversion
        byte newByteVar = 5;
        short s = byteVar;
        int i = s;

        // narrow type casting
        System.out.println("------Narrow type casting-----");
        double dtax = 2598.321;
        byte btax = (byte) dtax;
        short stax = (short) dtax;
        int itax = (int) dtax;
        System.out.println(btax);
        System.out.println(stax);
        System.out.println(itax);

        byte bex = 42;
        short cex = 1024;
        int iex = 50000;
        float fex = 5.47f;
        double dex = 0.254;
        // Q: what type should we cast this to?
        // result = (bex * cex) + (iex / fex) - (fex * fex);
        // A: double for largest possible
        double result = (bex * cex) + (iex / fex) - (fex * fex);
    }
}