package csw2.chapter4;

import java.util.regex.*;

public class StrReplace101 {

	public static void main(String[] args) {

		// (\b=word boundary)
		String patt = "\\bfavor";
		String input = "Do me a favor? Just a favor. Fetch my favorite.";
		System.out.println("Input: " + input);

		Pattern r = Pattern.compile(patt);
		Matcher m = r.matcher(input);
		// System.out.println("ReplaceAll: " + m.replaceAll("favour"));
		System.out.println("ReplaceFirst: " + m.replaceFirst("favour"));
		m.reset();

		StringBuffer sb = new StringBuffer();
		System.out.print("Append methods: ");
		while (m.find()) {
			// Copy to before first match,
			// plus the word "favor"
			m.appendReplacement(sb, "flower");
		}
		m.appendTail(sb);
		// copy remainder
		System.out.println(sb.toString());
	}

}
