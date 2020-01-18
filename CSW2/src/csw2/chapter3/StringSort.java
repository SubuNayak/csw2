package csw2.chapter3;
import java.util.*;

public class StringSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of strings:");
		int n = sc.nextInt();
		String s[] = new String[n];
		System.out.println("Enter "+n+" Strings:");
		for(int i=0; i<n; i++)
		{
			s[i] = sc.next();
			s[i] += sc.nextLine();
		}
		
		System.out.println("Before Sorting:");
		for(int i=0; i<n; i++)
		{
			System.out.print(s[i]+", ");
		}
		System.out.println();
		
		// Bubble sort algorithm
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j< n-i-1; j++)
			{
				if(s[j].compareTo(s[j+1]) > 0)
				{
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("After Sorting:");
		for(int i=0; i<n; i++)
		{
			System.out.print(s[i]+", ");
		}
		System.out.println();
	}

}
