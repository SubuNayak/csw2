package csw2.chapter4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex103 {

	public static void main(String[] args) {
		
		String text = "abcxy 100000";
		String regex = "((.*)(\\d{6}))";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		System.out.println(":total group = "+m.groupCount());
		
		if(m.find())
		{
			System.out.println("Group 1 : " + m.group(0));
			System.out.println("Group 2 : " + m.group(1));
			System.out.println("Group 3 : " + m.group(2));
		}
	}

}
