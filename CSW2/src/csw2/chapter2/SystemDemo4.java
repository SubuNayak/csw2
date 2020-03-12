package csw2.chapter2;

public class SystemDemo4 {

	public static void main(String[] args) {

		System.out.println("OS Name: " + System.getProperty("os.name"));
		System.out.println("OS Version: " + System.getProperty("os.version"));
		System.out.println("OS Architecture: " + System.getProperty("os.arch"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
		System.out.println("JDK Version: " + System.getProperty("java.version"));
		System.out.println("Path Separator: " + System.getProperty("path.separator"));
		System.out.println("File Separator: " + System.getProperty("file.separator"));

	}

}
