package csw2.chapter3;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s += sc.nextLine();
		
		
		String words[] = s.split("\\s+"); 
		
	}

}
