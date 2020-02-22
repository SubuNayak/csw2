package csw2.chapter5;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Numbers109 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		s += sc.nextLine();
		
		String text = "\\d+";
		int count = 0;
		
		Pattern p = Pattern.compile(text);
		Matcher m = p.matcher(s);
		
		int sum = 0;
		while(m.find()) {
			
			System.out.println(Integer.parseInt(m.group(0)));
			int num = Integer.parseInt(m.group(0));
			sum += num;
			
		}
		System.out.println("sum = "+sum);
		

}
}
