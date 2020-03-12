package csw2.chapter3;

import java.util.*;

public class trimName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String s = sc.next();
		s += sc.nextLine();

		String words[] = s.split(" ");
		for (int i = 0; i < words.length - 1; i++) {
			System.out.print(words[i].toUpperCase().charAt(0) + ".");
		}
		System.out.print(" ");
		System.out.print(words[words.length - 1]);
		System.out.println();
	}

}
