package csw2.chapter4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrReplace103 {

	public static void main(String[] args) throws IOException {

		BufferedReader obj = new BufferedReader(new FileReader(args[0]));

		String text = "([91|0]?)([7-9])(\\d{9})";
		String line;

		Pattern p = Pattern.compile(text);

		while ((line = obj.readLine()) != null) {
			Matcher m = p.matcher(line);

			if (m.find()) {
				System.out.println(line + ": Valid Phone number");
			} else {
				System.out.println(line + ": Invalid Phone number");
			}
		}

	}

}
