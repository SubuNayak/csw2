package csw2.chapter5;
import java.text.NumberFormat;

public class Round3 {

	public static void main(String[] args) {
		
		double d = 12.362369;
		
		NumberFormat form = NumberFormat.getInstance();
		
		form.setMinimumFractionDigits(2);
		form.setMaximumFractionDigits(4);
		
		System.out.println(form.format(d));
	}

}
