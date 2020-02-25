package csw2.chapter5;
import java.text.NumberFormat;
import java.util.*;

public class Round5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double n = sc.nextDouble();
		
		System.out.println("Enter Max fraction digits:");
		int max = sc.nextInt();
		System.out.println("Enter Min fraction digits:");
		int min = sc.nextInt();
		
		NumberFormat form = NumberFormat.getInstance();
		
		form.setMinimumFractionDigits(min);
		form.setMaximumFractionDigits(max);
		
		System.out.println();
		System.out.println("Input = "+n);
		System.out.println("Result = "+form.format(n));
	}

}
