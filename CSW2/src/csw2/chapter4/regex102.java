package csw2.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex102 {

	public static void main(String[] args) {
	
		String text = "om bivab nayak om";
		String regex = "om";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
//		while(m.find())
//		{
//			System.out.println("Pattern found from: "+m.start()+" - "+(m.end()-1));
//		}
		while(m.find())
			{
				System.out.println("Pattern found from: "+m.start()+" - "+(m.end()-1));
				break;
			}
		System.out.println("-----------------------");
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println("-----------------------");
		
		//boolean d = m.find();
		//System.out.println(d);
		boolean b = m.matches();
		boolean c = m.lookingAt();
		
		
		System.out.println(b);
		System.out.println(c);
		
	}

}
