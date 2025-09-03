package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the name of member1? ");
		String s0 = in.nextLine();
		System.out.print("What is the name of member2? ");
		String s1 = in.nextLine();
		System.out.print("What is the name of member3? ");
		String s2 = in.nextLine();
		System.out.print("What is the name of member4? ");
		String s3 = in.nextLine();
		System.out.print("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3);
	}
}
