package csw2.chapter3;

public class Strings101 {

	public static void main(String[] args) {

		String s = "Java";
		char[] ch = { 'h', 'e', 'l', 'l', 'o' };
		String s1 = new String(ch);
		String s2 = new String("Welcome");
		System.out.println(s + " " + s1 + " " + s2);
		s.concat(" lesson");
		System.out.println(s);

		// Substring
		String s3 = "Iter is my College";
		System.out.println(s3.substring(1));
		System.out.println(s3.substring(2, 6));

	}

}
