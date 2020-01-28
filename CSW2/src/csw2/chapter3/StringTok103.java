package csw2.chapter3;
import java.util.*;

public class StringTok103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String separated with _ :");
		String s = sc.next();
		s += sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s, "_' ");
		while(st.hasMoreTokens()) {
			System.out.println("Token : "+st.nextToken());
		}
	}

}
