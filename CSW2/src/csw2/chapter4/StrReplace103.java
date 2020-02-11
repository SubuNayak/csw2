package csw2.chapter4;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrReplace103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String s = sc.next();
		s += sc.nextLine();
		
		
		String text = "([91|0]?)([7-9])(\\d{9})";
		Pattern p = Pattern.compile(text);
		Matcher m = p.matcher(s);
		
		if(m.find())
		{System.out.println("Valid Phone number");}
		
		
	}
	
	

}
