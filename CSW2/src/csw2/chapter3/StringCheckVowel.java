package csw2.chapter3;
import java.util.Scanner;

public class StringCheckVowel {

	public static void main(String[] args) {
		
		int v =0, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();
		s = s.trim();
		System.out.println(s);
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				{
					v++;
				}
				else if(s.charAt(i)==' ' && s.charAt(i)!=',' && s.charAt(i)!='.')
				continue;
				else
				{c++;}
			}
		System.out.println("No. of vowels: "+v);
		System.out.println("No. of consonants: "+c);
		

	}

}
