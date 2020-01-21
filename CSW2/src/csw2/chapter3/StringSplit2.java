package csw2.chapter3;
import java.util.Scanner;

public class StringSplit2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s += sc.nextLine();
		
		
		//String words[] = s.split(" ");
		String words[] = s.split("\\s+");
		System.out.println("First two words of the string are:");
		for(int i=0; i<2; i++)
		{
			System.out.print(words[i]+" ");
		}
		System.out.println();
		
	}

}
