package csw2.chapter3;
import java.util.*;


public class StringWordReplace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();
		System.out.println("Before Replacement:");
		System.out.println(s);
		System.out.println();
		System.out.println("Enter target string:");
		String regex = sc.next();
		System.out.println("Enter replacement string:");
		String replacement = sc.next();
		
		System.out.println("After replacement:");
		System.out.println(s.replaceAll(regex, replacement));
		
	}

}
