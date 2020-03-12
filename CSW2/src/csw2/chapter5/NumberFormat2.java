package csw2.chapter5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormat2 {

	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat("##0.##");

		double d = 57678544.456877;
		System.out.println(nf.format(d));

	}

}
