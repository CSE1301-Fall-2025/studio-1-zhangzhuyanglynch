package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("There are 2 integers to be averaged");
        System.out.print("Input the first integer: ");
        int n1 = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int n2 = scanner.nextInt();
        double avg = (double) (n1+n2)/2;
        System.out.println("The average of " + n1 + " and " + n2 + " is " + avg);
        scanner.close();

    }
}
