package csw2.chapter3;
import java.util.*;

public class replaceDelim {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		s += sc.nextLine();
		
		StringTokenizer str = new StringTokenizer(s, " ");
		StringBuilder b = new StringBuilder();
		
		while(str.hasMoreElements())
		{
			b.append(str.nextElement());
			if(str.hasMoreElements())
			{
				b.append("#");
			}
		}
		System.out.println(b);
		
	}

}
