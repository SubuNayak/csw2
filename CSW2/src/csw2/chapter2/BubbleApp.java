package csw2.chapter2;

import java.util.*;
import csw2.chapter1.BubbleSort;

public class BubbleApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" array elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		BubbleSort obj = new BubbleSort();
		obj.sort(a);
		System.out.println("Array After Sorting:");
		obj.display(a);
		sc.close();
		

	}

}
