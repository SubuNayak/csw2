package csw2.chapter3;

import java.util.Scanner;

public class Prog_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s = sc.nextLine();
		System.out.println("Enter the second string:");
		String s1 = sc.nextLine();

		String s2 = s.substring(0, 6);
		String s3 = s1.substring(0, 8);
		System.out.println(s2.concat(s3));

	}

}
