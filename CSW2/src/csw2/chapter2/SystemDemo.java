package csw2.chapter2;
import java.util.Map;

public class SystemDemo {

	public static void main(String[] args) {
		
		System.out.println("Read specific environment variable");
		System.out.println("PATH value" + System.getenv("PATH"));
		System.out.println("\n Read All environment variable:- \n");
		Map<String, String> map = System.getenv();
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("Variable name = " + entry.getKey() + " & value is = "+entry.getValue());
			
		}
		
	}

}
