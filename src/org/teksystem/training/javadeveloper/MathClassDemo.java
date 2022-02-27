package org.teksystem.training.javadeveloper;

public class MathClassDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        //We cannot create object of Math class by using new operator,
        //because Math class has static methods.
        int z = Math.max(x, y);
        System.out.println(z);

        //square root
        double resultSQ = Math.sqrt(y);
        System.out.println("Math.sqrt(y): " + resultSQ);
        System.out.println("Math.log(x): " + Math.log(x));
        System.out.println("Math.log10(x): " +Math.log10(x));
        System.out.println("Math.pow(3,3): " + Math.pow(3,3));

        double d = 83.67;
        System.out.println("Math.ceil(d): " + Math.ceil(d));
        System.out.println("Math.floor(d): " + Math.floor(d));
        System.out.println("Math.rint(d): " + Math.rint(d));
        System.out.println("Math.round(d): " + Math.round(d));

        System.out.println("------------------------");

        double c = 90;
        double rangle = 1.365;

        // convert degreee into Radians
        double myradian=   Math.toRadians(c);
        System.out.println(Math.toDegrees(rangle));

        System.out.println( Math.sin(myradian));
        Math.tan(myradian);
        Math.cos(myradian);

        System.out.println("------------------ random()------------------");
        // ( 0.0 <= math.random()  < 1.0 )
        double randValue = Math.random(); // 0.0  to  1.0
        // System.out.println((randValue * 60));
        double multinumberRan =    randValue * 60;
        System.out.println(multinumberRan);
        // int   randumnumberinteger  =  (int)(randValue * 60);
        int randumnumberinteger =  (int)(multinumberRan);  // Narrow casting
        System.out.println(randumnumberinteger); // 0 to 59

        // 0 to 99
        // double multinumberRan = (int)    ( ( Math.random() ) * 100 );
    }
}
