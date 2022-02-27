package org.teksystem.training.javadeveloper;
import java.util.Scanner;

public class DisplayingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Input seconds: 86399
        int seconds = scan.nextInt();
        scan.close();

        int hours = seconds / 3600;
        System.out.println("hours: " + hours);

        // remainingSeconds = 86399 % 3600 = 3599
        // remainingSeconds =  % 3600 = 3599
        int remainingSeconds = seconds % 3600;
        System.out.println("remaining seconds: " + remainingSeconds);

        int remainingMinutes = remainingSeconds % 60;
        System.out.println("remaining minutes: " + remainingMinutes);

        //Output: 23:59:59
        //System.out.println(hours + ":" + remainingMinutes + ":" + remainingSeconds);

        //find remainder of seconds from 61
        // secondsInput % 60 =
        // 61 % 60 = 1

    }
}
