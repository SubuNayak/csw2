package csw2.chapter4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex105 {

	public static void main(String[] args) {

		String text = "jeevan@puhan.com";
		String mail = "(.*)(\\@)(.*)(\\.)(.*)";

		String text2 = "http://jeevanpuhan.com";
		String url = "(^http://)(.*)(\\.)(.*)";

		Pattern p = Pattern.compile(mail);
		Matcher m = p.matcher(text);

		Pattern p1 = Pattern.compile(url);
		Matcher m1 = p1.matcher(text2);

		System.out.println();

		if (m.matches()) {
			System.out.println("Valid E-mail Id");
		} else {
			System.out.println("Invalid E-mail Id");
		}
		System.out.println("------------------");
		if (m1.matches()) {
			System.out.println("Valid URL");
		} else {
			System.out.println("Invalid URL");
		}
	}

}
