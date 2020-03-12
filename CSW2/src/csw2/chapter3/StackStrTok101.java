package csw2.chapter3;

import java.util.*;

public class StackStrTok101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();

		StringTokenizer str = new StringTokenizer(s, ",* ", true);
		Stack<String> obj = new Stack<>();

		while (str.hasMoreTokens()) {
			obj.push(str.nextToken());
		}

		while (!obj.empty()) {
			System.out.print(obj.pop() + " ");
		}
		System.out.println();

	}

}
