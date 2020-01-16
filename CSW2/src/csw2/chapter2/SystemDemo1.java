package csw2.chapter2;
import java.util.Properties;
import java.util.*;

public class SystemDemo1 {

	public static void main(String[] args) {
		
		Properties p = System.getProperties();
		p.list(System.out);
		/*Set<Object> keyset = p.keySet();
		for(Object key:keyset) {
			System.out.println("Key is "+key );
			
		}*/
		
	}

}
