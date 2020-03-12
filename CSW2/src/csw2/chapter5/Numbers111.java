package csw2.chapter5;

public class Numbers111 {

	public static void main(String[] args) {

		double d = 123;
		double e = 0;
		System.out.println(d / e);
		if (d / e == Double.NEGATIVE_INFINITY)
			System.out.println("Check for NEGATIVE_INFINITY works");
		double s = Math.sqrt(-1);
		if (s == Double.NaN)
			System.out.println("Comparison with NaN incorrectly returns true");
		if (Double.isNaN(s))
			System.out.println("Double.isNaN() correctly returns true");

	}

}
