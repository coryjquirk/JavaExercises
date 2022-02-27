package org.teksystem.training.javadeveloper;

public class StringDemo {
    public static void main (String[] args) {
        String st  = "Welcome to java, Haseeb is your instructor"; // Literal

        String st1 = new String("Welcome to Tekglobal"); // New operator and call a constructor of String class

// String is immutable
        String st_Result =  st.replace("java", "python");
        System.out.println(st_Result);
        System.out.println(st);

        int stlenght =  st.length();
        System.out.println(stlenght);

        System.out.println(st.concat(st1));

        System.out.println( st + " " + st1  );

        System.out.println( st.charAt(1));

        System.out.println(st.indexOf('t'));

        System.out.println(st.lastIndexOf('t'));

        String a = "Haseeb";
        String b = "Haseeb";

        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));

        System.out.println(st.toUpperCase());

        String c = "welcome to java";
        System.out.println(c.substring(0,6));

        // Convert String into Number

        String stNum = "20";

        int  pint =   Integer.parseInt(stNum); // return primitive data type
        Integer nonpint =  Integer.valueOf(stNum); // return non primitive or Wrapper

        System.out.println(pint);
        System.out.println(nonpint);
        int rr = pint + 30;

        double pdouble =   Double.parseDouble(stNum);
        Double nonpdouble =   Double.valueOf(stNum);


        Integer d = 30;


        String numberResult =  d.toString();
        System.out.println(numberResult);


        Double dd = 30.33;
        String abcd =  dd.toString();
        System.out.println("--------------------");

        String myMessage = "Hello User: order placed successfully. Total amount 600 and Tax is 2.5.";
        int orderAmount = 600;
        float tax = 2.5f;
        String username = "Cory";
        System.out.printf("Hello %s: Your order was successfully placed. Total amount is %d and Tax is %f", username, orderAmount, tax);


    }

}
