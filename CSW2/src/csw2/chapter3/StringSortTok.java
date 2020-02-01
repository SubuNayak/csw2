package csw2.chapter3;
import java.util.*;

public class StringSortTok {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		s += sc.nextLine();
		
		StringTokenizer str = new StringTokenizer(s);
		int n = str.countTokens();
		String s1[] = new String[n];
			
			int k= 0;
			while(str.hasMoreTokens())
			{
			s1[k] = str.nextToken();
			k++;
			}
		
		System.out.println("Before Sorting:");
		for(String t:s1)
		{
			System.out.println(t);
		}
		
		// Bubble sort algorithm
				
				for(int i=0; i<n-1; i++)
				{
					for(int j=0; j< n-i-1; j++)
					{
						if(s1[j].compareTo(s1[j+1]) > 0)
						{
							String temp = s1[j];
							s1[j] = s1[j+1];
							s1[j+1] = temp;
						}
					}
				}
				System.out.println();
				
			System.out.println("After Sorting:");
			for(String t:s1)
			{
				System.out.println(t);
			}	
	}

}
