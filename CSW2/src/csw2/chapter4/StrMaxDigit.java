package csw2.chapter4;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrMaxDigit {

	public static void main(String[] args) throws IOException {
		
		BufferedReader obj = new BufferedReader(new FileReader(args[0]));
		
		String text = "\\d+";
		String line;
		
		
		Pattern p = Pattern.compile(text);
		
		while((line = obj.readLine()) != null) {
			Matcher m = p.matcher(line);
			
			if(m.find())
			{System.out.println(Integer.parseInt(m.group(0)));}
			
		}
		
		
		
		
	}
	
	

}
