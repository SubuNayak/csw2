// Wrapper classes are defined under java.lang package
package csw2.chapter5;

import java.util.ArrayList;

public class Numbers101 {

	public static void main(String[] args) {
		
		int i=5; // i is a primitive data type with value 5
		Integer i1 = new Integer(5); // wrapper class object
		Integer i2 = new Integer(i); // Boxing/Wrapping where pdt int is wrapped under i2
		Integer i3 = i; // Auto-Boxing where we directly assign pdt to i3
		
		int j = i2.intValue(); // unboxing/unwapping which fetches int value from i2
		int k = i3; // Auto-unboxing 
		
		System.out.println("i = "+i+" i1 = "+i1+" i2 = "+i2+" i3 = "+i3);
		System.out.println("j = "+j+" k = "+k);
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(7);
		values.add(8); // values.add(obj) = object is passed
		
	}

}
