package csw2.chapter5;

import java.text.NumberFormat;

public class Round4 {

	public static void main(String[] args) {

		double d = 12.362369;

		NumberFormat form = NumberFormat.getInstance();

		form.setMinimumIntegerDigits(3);
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);

		System.out.println(form.format(d));
	}

}
