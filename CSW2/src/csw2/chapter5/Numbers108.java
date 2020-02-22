package csw2.chapter5;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader obj = new BufferedReader(new FileReader(args[0]));
		
		String text = "(\\d+)(\\s+)(\\d+)(\\s+)(\\d+)";
		String line;
		int sum = 0;
		
		Pattern p = Pattern.compile(text);
		
		System.out.println("PRODID\tPRICE\tQNTY");
		while((line = obj.readLine()) != null) {
			Matcher m = p.matcher(line);
			
			if(m.find())
			{
				System.out.println(m.group(0));
				int rate = Integer.valueOf(m.group(3)) * Integer.valueOf(m.group(5));
				sum += rate;
			}
		}
		System.out.println();
		System.out.println("Total Price of the stock = Rs."+sum);
		
		
	}

}
