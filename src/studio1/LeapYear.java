package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year= scanner.nextInt ();
        
        int remainder4 = year % 4;
        int remainder100 = year % 100;
        int remainder400 = year % 400;

        boolean Leap = ((remainder4==0 && remainder100!=0) || (remainder400==0));
        System.out.println(year + " is a leap year: " + Leap);


    }
}
