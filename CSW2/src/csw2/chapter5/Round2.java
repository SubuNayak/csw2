package csw2.chapter5;
import java.text.NumberFormat;

public class Round2 {

	public static void main(String[] args) {
		
		double d = 12245154.362369;
		
		NumberFormat form = NumberFormat.getInstance();
		
		form.setMaximumFractionDigits(2);
		
		System.out.println(form.format(d));
	}

}
