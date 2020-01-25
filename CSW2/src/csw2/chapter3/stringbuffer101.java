package csw2.chapter3;

public class stringbuffer101 {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Jeevan");
		s.append(" Puhan");
		s.replace(0, 6, "lembu");
		String s1 = s.toString();
		s1 =  s1.toUpperCase();
		System.out.println(s);
		System.out.println(s1);
	}

}
