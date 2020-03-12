package csw2.chapter3;

import java.util.*;

public class StrTok102 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String separated with , :");
		String s = sc.next();
		s += sc.nextLine();

		StringTokenizer st = new StringTokenizer(s, ",", true);
		while (st.hasMoreTokens()) {
			System.out.println("Token : " + st.nextToken());
		}
	}

}
