package org.teksystem.training.javadeveloper;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // primitive type
        int primitiveType = 1;
        // Wrapper class, nonprimitive type
        Integer nonPrimitiveType = 1;
        Integer iii = new Integer(1);

        boolean primitiveBool = true;
        Boolean nonPrimitiveBool = true;

        //-------auto boxing-------
        int myNewInt = 20;
        Integer aObj = myNewInt;
        System.out.println(aObj.compareTo(22));

        char c = 'A';
        Character ch = c;

        double d = 2563.32;
        Double dObj = d;

        //-------unboxing-------
        //changing aObj back into primitive type.
        int aa = aObj;
    }
}
