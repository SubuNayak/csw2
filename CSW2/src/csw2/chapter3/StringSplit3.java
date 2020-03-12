package csw2.chapter3;

import java.util.Scanner;

public class StringSplit3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s += sc.nextLine();
		sc.close();

		String words[] = s.split(" ");
		// String words[] = s.split("\\s+");
		System.out.println("Reverse of the string word wise:");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		System.out.println();

	}

}
