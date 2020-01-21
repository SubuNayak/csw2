package csw2.chapter3;
import java.util.*;

public class StringCapitalize {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();
		s = s.toLowerCase();
		String words[] = s.split("\\s+");
		
		for(int i =0; i<words.length;i++)
		{
			for(int j=0; j<words[i].length(); j++)
			{
				if(j==0)
					System.out.print(Character.toUpperCase(words[i].charAt(0)));
				else
					System.out.print(words[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}

}
