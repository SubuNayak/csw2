package csw2.chapter3;

import java.util.Scanner;

public class StringSentenceSplit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s += sc.nextLine();

		int n = s.indexOf(" ");
		String s1 = s.substring(0, n + 1);
		String s2 = s.substring(n, s.length());
		System.out.println(s1 + " | " + s2);

	}

}
