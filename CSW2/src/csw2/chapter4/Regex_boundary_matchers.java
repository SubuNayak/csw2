package csw2.chapter4;

import java.util.regex.Pattern;
/*
 * Use of boundary matchers
 *  ^  : Start of a line
 *  $  : end of a line
 * \b  : word boundary
 * \B  : non-word boundary
 * \A  : start of a string
 * \Z  : end of a string*/

public class Regex_boundary_matchers {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("^cat", "cat"));
		System.out.println(Pattern.matches("cat$", "abc cat"));
		System.out.println(Pattern.matches("\bcat\b", "abc catxyz"));
		System.out.println(Pattern.matches("\\Bcat\\B", "cat s"));
		System.out.println(Pattern.matches("\\Acat", "cat "));
		System.out.println(Pattern.matches("^cat\\z", "abc catpqqr xyz"));
		System.out.println();
		System.out.println(Pattern.matches("a[bc]d", "acd"));
		System.out.println(Pattern.matches("a[bc]d", "abd"));
		System.out.println(Pattern.matches("a[bc]d", "abcd"));
		System.out.println(Pattern.matches("a[bc]d", "ad"));
		System.out.println();
		System.out.println(Pattern.matches("[tT]om", "Tom"));
		System.out.println(Pattern.matches("[tT]om", "tom"));
		System.out.println();
		System.out.println(Pattern.matches("a[^bc]d", "acd"));
		System.out.println(Pattern.matches("a[^bc]d", "aed"));
		System.out.println(Pattern.matches("[a-z][A-Z]", "acd"));
		System.out.println(Pattern.matches("[a-z][A-Z]", "bB"));
		System.out.println(Pattern.matches("[a-z][A-Z]", "a"));
		System.out.println(Pattern.matches("[a-z][A-Z]", "a"));
		System.out.println("--------------------------------");
		System.out.println(Pattern.matches("[tTJj]om|[Jj]an", "Tom"));
		System.out.println(Pattern.matches("[tTJj]om|[Jj]an", "tom"));
		System.out.println(Pattern.matches("[tTJj]om|[Jj]an", "Jan"));
		System.out.println(Pattern.matches("[tTJj]om|[Jj]an", "jan"));
		System.out.println("--------------------------------");
		System.out.println(Pattern.matches("An[^ nd].*", "Angie"));
		System.out.println("--------------------------------");
		System.out.println(Pattern.matches(".*@.*.com", "jeevan@gmail.com"));
	}

}
