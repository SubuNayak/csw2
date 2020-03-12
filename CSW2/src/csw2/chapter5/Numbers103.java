package csw2.chapter5;

public class Numbers103 {

	public static void main(String[] args) {

		Byte b1 = new Byte("6");
		byte b = b1.byteValue();
		System.out.println("b = " + b);

		Short s1 = new Short("5");
		short s = s1.shortValue();
		System.out.println("s = " + s);

		Integer i1 = new Integer(54);
		int i = i1.intValue();
		System.out.println("i = " + i);

		Long l1 = new Long(55534655);
		long l = l1.longValue();
		System.out.println("l = " + l);

		Float f1 = new Float(2.3f);
		float f = f1.floatValue();
		System.out.println("f = " + f);

		Double d1 = new Double(547.694);
		double d = d1.doubleValue();
		System.out.println("d = " + d);

		Character c1 = new Character('a');
		char c = c1.charValue();
		System.out.println("c = " + c);

		Boolean bo1 = new Boolean(true);
		boolean bo = bo1.booleanValue();
		System.out.println("bo = " + bo);

	}

}
