package csw2.chapter5;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat1 {
	
	// NumberFormat class provides methods for formatting
	// numbers, currencies and percentage values of different locales.
	public static void main(String[] args) {
		// it returns reference for default locale.
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat nfa = NumberFormat.getCurrencyInstance(Locale.CHINA);
		nf.setMaximumFractionDigits(2);
		double d = 123.456;
		
		
		// to format the double value to locale object
		System.out.println(nf.format(d));
		System.out.println(nfa.format(d));
	}

}
