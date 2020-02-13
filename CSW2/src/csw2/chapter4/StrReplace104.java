package csw2.chapter4;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StrReplace104 {

	public static void main(String[] args) throws IOException {
		
		Pattern patt = Pattern.compile("[A-Z][a-z]+");
		BufferedReader obj = new BufferedReader(new FileReader(args[0]));
		
		String line;
		while((line = obj.readLine()) != null) {
			Matcher m = patt.matcher(line);
			
			while(m.find())
			{
				System.out.println(m.group(0));
			}
		}
		
		
	}

}
