package teksystems.java.exercise;

public class JavaBasicsClass {
    // Write a program that declares 2 integer variables, assigns an integer to each,
    // and adds them together. Assign the sum to a variable. Print out the result.
    static void theSum() {
        {
            int x;
            int y;
            x = 5;
            y = 6;
            int mySum = x + y;
            System.out.println("mySum: " + mySum);
        }
    }
    // Write a program that declares 2 double variables, assigns a number to each,
    // and adds them together. Assign the sum to a variable. Print out the result.
    static void doubleSum(){
        double x;
        double y;
        x = 2.5;
        y = 3.1;
        double doubleSum = x + y;
        System.out.println("doubleSum: " + doubleSum);
    }
    // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
    // Assign the sum to a variable. Print out the result. What variable type must the sum be?
    static void intDouble(){
        int x;
        double y;
        x = 10;
        y = 2.5;
        double z = x + y;
        System.out.println("intDouble: " + z + ", must be type `double`.");
    }
    // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
    // Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?
    static void intDivide(){
        int x = 10;
        int y = 5;
        int z = x / y;
        System.out.println("z: " + z);
        double xx = 10.5;
        double zz = xx / y;
        System.out.println("zz: " + zz);
    }
    // Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller.
    // Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
    static void doubleDivide(){
        double x = 533.54;
        double y = 121.12;
        double z = x / y;
        System.out.println("double / double: " + z);
        int recastZ = (int) z;
        System.out.println("recast to int: " + recastZ);
    }
    // Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
    // Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
    static void recastInts(){
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("q: " + q);
        q = (double) y;
        System.out.println("q recast as y: " + q);
    }
    // Write a program that declares a named constant and uses it in a calculation. Print the result.
    static void usingConstant(){
        final double GRASSHOPPERS = 563113.0;
        double harvestMonths = 7.0;
        double ghPerMonth = GRASSHOPPERS / harvestMonths;
        System.out.println("Grasshoppers per month: " + ghPerMonth);
    }

    // Write a program where you create 3 variables that represent products at a cafe.
    // The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
    // Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product,
    // 4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal.
    // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
    // Be sure to format the results to 2 decimal places.
    static void cafeTime(){
        double coffee = 3.54;
        double cappuccino = 5.11;
        double espresso = 4.13;
        double greenTea = 3.10;

        double subtotal;
        double totalSale;
        final double SALES_TAX = 6.065;

        double subTotal = (3 * coffee) + (4 * cappuccino) + (2  * espresso);
        totalSale = subTotal + subTotal * SALES_TAX;
        System.out.println("totalSale: ");
        System.out.format("%.2f", totalSale);
        //totalSale: 277.80
    }

    public static void main(String[] args) {
        theSum();
        doubleSum();
        intDouble();
        intDivide();
        doubleDivide();
        recastInts();
        usingConstant();
        cafeTime();
    }

}
