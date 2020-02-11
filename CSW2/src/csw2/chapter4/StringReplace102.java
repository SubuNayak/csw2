package csw2.chapter4;
import java.util.regex.*;
import java.util.Scanner;

public class StringReplace102 {

	public static void main(String[] args) {
		
		String patt = " ";
		String input = "Do me a favor? Fetch my favorite.";
		System.out.println("Input: " + input);
		
		Pattern r = Pattern.compile(patt);
		Matcher m = r.matcher(input);
		System.out.println("ReplaceAll: " + m.replaceAll(""));
		
	}

}
