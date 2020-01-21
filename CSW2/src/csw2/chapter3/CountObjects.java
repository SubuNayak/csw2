package csw2.chapter3;

class Lembu
{
static int counter=0;

	public Lembu()
	{
	counter++;
	}

}

public class CountObjects {

	public static void main(String[] args) {
		
		Lembu obj = new Lembu();
		Lembu obj1 = new Lembu();
		Lembu obj2 = new Lembu();
		
		System.out.println("No. of objects created = "+obj.counter);
		

	}

}
