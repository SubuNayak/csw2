package csw2.chapter3;

import java.util.*;

public class StrTok106 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();

		StringTokenizer str = new StringTokenizer(s, ",* ", true);

		while (str.hasMoreElements()) {
			System.out.println("Token: " + str.nextElement());
		}

	}

}
