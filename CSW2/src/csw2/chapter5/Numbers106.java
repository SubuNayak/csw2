package csw2.chapter5;

import java.util.Scanner;

public class Numbers106 {

	public static void main(String[] jeevan) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real number:");
		String s = sc.next();
		s += sc.nextLine();
		System.out.println("Real Num = " + s);

		String a[] = s.split("\\.");

		int sum = Integer.valueOf(a[0]) + Integer.valueOf(a[1]);
		System.out.println("Sum = " + sum);
	}

}
