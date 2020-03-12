package csw2.chapter3;

import java.util.*;

public class NonRepCharString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		s += sc.nextLine();
		int count = 230;
		System.out.print("The first non-repeating character: ");
		int i, j;
		for (i = 0; i < s.length(); i++) {
			count = 0;
			if (s.charAt(i) != ' ') {
				for (j = 0; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}

				if (count == 1) {
					System.out.println(s.charAt(i));
					break;
				}

			}
		}
	}
}
