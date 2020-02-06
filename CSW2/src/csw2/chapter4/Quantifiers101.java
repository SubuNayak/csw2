package csw2.chapter4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Quantifiers101 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[pqr]?", "p"));
		System.out.println(Pattern.matches("[pqr]?.*", "pp"));
		System.out.println(Pattern.matches("[pqr]?", "ppq"));
		System.out.println(Pattern.matches("[pqr]?", "qq"));
		System.out.println(Pattern.matches("[pqr]?", "pabc"));
		System.out.println("--------------------");
		System.out.println(Pattern.matches("[pqr]+", "p"));
		System.out.println(Pattern.matches("[pqr]+", "pp"));
		System.out.println(Pattern.matches("[pqr]+", "ppqqqrr"));
		System.out.println("--------------------");
		System.out.println(Pattern.matches("[pqr]*", "ppq"));
		System.out.println(Pattern.matches("[pqr]*", "qq"));
		System.out.println(Pattern.matches("[pqr]*", "p"));
		System.out.println("--------------------");
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\D", "pp"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D.*", "ITER"));
		
	}

}
