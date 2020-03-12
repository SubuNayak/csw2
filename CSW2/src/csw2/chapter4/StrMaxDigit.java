package csw2.chapter4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrMaxDigit {

	public static void main(String[] args) throws IOException {

		BufferedReader obj = new BufferedReader(new FileReader(args[0]));

		String text = "\\d+";
		String line;
		int count = 0;

		Pattern p = Pattern.compile(text);
		int max = 0;
		while ((line = obj.readLine()) != null) {
			Matcher m = p.matcher(line);

			if (m.find()) {
				System.out.println(Integer.parseInt(m.group(0)));
				int num = Integer.parseInt(m.group(0));
				if (num > max) {
					max = num;
				}
				count++;
			}
		}

		System.out.println("count = " + count);
		System.out.println("Max = " + max);

	}

}
