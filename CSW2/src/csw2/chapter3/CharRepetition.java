package csw2.chapter3;
import java.util.Scanner;

public class CharRepetition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();
		s.trim();
		System.out.println(s);
		s = s.toLowerCase();
		int counter = 0, max = 0; char ch=0;
		for(int i = 0; i<s.length(); i++)
		{
			for(int j=i+1; i<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					counter++;
				}
			}
				ch = s.charAt(i);
		}
		System.out.println("Most frequent Character = "+ch);
		System.out.println("No. of repetitions = "+counter);

	}

}
