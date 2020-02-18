package csw2.chapter4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StrMaxValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		s += sc.nextLine();
		
		String text = "\\d+";
		int count = 0;
		
		Pattern p = Pattern.compile(text);
		Matcher m = p.matcher(s);
		
		int max = 0;
		while(m.find()) {
			
			System.out.println(Integer.parseInt(m.group(0)));
			int num = Integer.parseInt(m.group(0));
			if (num>max)
				{max = num;}
			count++;
			
		}
		
		System.out.println("count = "+count);
		System.out.println("Max = "+max);

}
}
