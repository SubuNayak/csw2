package csw2.chapter5;
import java.util.*;

public class Numbers107 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your D.O.B in dd/mm/yy format:");
		String dob= sc.next();
		System.out.println("Enter current date:");
		String date= sc.next();
		
		String a[] = dob.split("\\/");
		String b[] = date.split("\\/");
		
		int yy = Integer.valueOf(b[2])-Integer.valueOf(a[2]);
		int mm = Integer.valueOf(b[1])-Integer.valueOf(a[1]);
		int dd = Integer.valueOf(b[0])-Integer.valueOf(a[0]);
		
		System.out.println("Age: "+yy+" years, " +Math.abs(mm)+" months, "+Math.abs(dd)+" days." );
		
	}

}
