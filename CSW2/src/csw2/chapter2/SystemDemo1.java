package csw2.chapter2;
import java.util.Properties;
import java.util.*;

public class SystemDemo1 {

	public static void main(String[] args) {
		
//		Properties p = System.getProperties();
//		p.list(System.out);
		System.out.println("OS Name: "+System.getProperty("os.name"));
		System.out.println("OS Version: "+System.getProperty("os.version"));
		System.out.println("OS Architecture: "+System.getProperty("os.arch"));
		System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
		System.out.println("JDK Version: "+System.getProperty("java.version"));
		System.out.println("Path Separator: "+System.getProperty("path.separator"));
		System.out.println("File Separator: "+System.getProperty("file.separator"));
		
//		Set<Object> keyset = p.keySet();
//		for(Object key:keyset) {
//			System.out.println("Key is = "+key );
//			
//		}
		
	}

}
