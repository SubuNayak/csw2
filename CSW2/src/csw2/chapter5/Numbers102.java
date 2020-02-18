//Boxing Process
package csw2.chapter5;

public class Numbers102 {

	public static void main(String[] args)
	{
		// Boxing using constructors
		// 1. using own type data
		// 2. using own data in form of string
		Integer obj1 = new Integer(123);
		Integer obj2 = new Integer("124");
		
		// Boxing using valueOf() method
		Integer obj3 = Integer.valueOf(125);
		Integer obj4 = Integer.valueOf("126");
		
		System.out.println("obj1 "+obj1);
		System.out.println("obj2 "+obj2);
		System.out.println("obj3 "+obj3);
		System.out.println("obj4 "+obj4);
		
		Character obj5 = new Character('a');
		Character obj10 = Character.valueOf('a');
		
				
		Float obj7 = new Float(0.36f);
		Float obj71 = Float.valueOf(0.36f);
		Float obj8 = new Float("0.96f");
		Float obj81 = Float.valueOf("0.96f");
		Float obj9 = new Float(548.54887);
		Float obj91 = Float.valueOf(548.54887f);
		
		System.out.println("obj5 "+obj5);
		System.out.println("obj7 "+obj7);
		System.out.println("obj8 "+obj8);
		System.out.println("obj9 "+obj9);
		
		System.out.println("obj10 "+obj10);
		
		// unboxing process
		int a = obj1.intValue();
		String s1 = obj1.toString();
		int b = obj3.intValue();
		String s2 = obj4.toString();
		
		System.out.println();
		System.out.println("After unboxing process: ");
		System.out.println("a "+a);
		System.out.println("s1 "+s1);
		System.out.println("b "+b);
		System.out.println("s2 "+s2);
	}
}
