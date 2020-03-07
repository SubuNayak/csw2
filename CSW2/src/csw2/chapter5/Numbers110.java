package csw2.chapter5;
import java.util.Scanner;
public final class Numbers110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a real number:");
		double d = sc.nextDouble();
		Double e = d;
		
		String s = e.toString();
		String a[] = s.split("\\.");
		
		int sum = 0;
		sum = Integer.valueOf(a[0]) + Integer.valueOf(a[1]);
		System.out.println("SUM = "+sum);
		
	}

}
