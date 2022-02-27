package org.teksystem.training.javadeveloper;

public class OperatorExamples {
    public static void main(String[] args) {
        int score = 10;
        int temp = 200;
        boolean rs = (score >= 10) && (temp >= 300); //true false = false
        System.out.println(rs);

        boolean rs2 = (score >= 10) || (temp >= 300);
        System.out.println(rs2);

        int z = 10;
        System.out.println(~z);

        //-------------xor------------
        int age = 24;
        int weight = 140;
        boolean rs3 = (age > 34) ^ (weight > 140); // false ^ flase = true
        System.out.println(rs3);

        boolean rs4 = (age >14) ^ (weight > 140); // true ^ false = true
        System.out.println(rs4);

        boolean rs5 = (age > 14) ^ (weight > 40); // false ^ true = false
        System.out.println(rs5);

        boolean rs6 = (age > 25) ^ (weight > 40); // false ^ true = true
        System.out.println(rs6);
    }
}
