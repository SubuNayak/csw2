package csw2.chapter1;

public class LinearSearch {
	
	
	public void search(int a[], int s) {
		
		int flag = 0;
		for(int i=0; i<a.length; i++)
		{
			if(s == a[i])
			{
			System.out.println("Element found at position "+(i+1));
			flag = 1;
			break;
			}
		}
		if(flag ==0)
		System.out.println("Element not found!");
	}

}
