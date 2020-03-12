package csw2.chapter3;

import java.util.*;

public class StrCapitalizeTok {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();

		StringTokenizer str = new StringTokenizer(s, " ");
		StringBuilder b = new StringBuilder();

		while (str.hasMoreElements()) {
			String st = str.nextElement().toString();
			b.append(st);

			if (str.hasMoreElements()) {
				b.append("_");
			}
		}
		System.out.println(b);

	}

}
