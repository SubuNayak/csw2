package csw2.chapter4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex104 {

	public static void main(String[] args) {

		String text = "1234567890";
		String regex = "(\\d{3})(\\d{3})(\\d{4})";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		System.out.println(":total group = " + m.groupCount());
		System.out.println();
		System.out.println("Input : " + text);
		System.out.print("Output : ");

		if (m.find()) {
			System.out.println("(" + m.group(1) + ") " + m.group(2) + "-" + m.group(3));
		}
	}

}
