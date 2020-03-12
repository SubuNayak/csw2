package csw2.chapter4;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StrPattSplit2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		s += sc.nextLine();
		System.out.println("Input: " + s);
		System.out.println();

		String text = "is";

		Pattern p = Pattern.compile(text, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);

		String s1 = m.replaceAll(" ");
		String s2[] = s1.split("\\s+");

		System.out.println("After Split: ");
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}

}
