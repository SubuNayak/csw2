package csw2.chapter1_1;

import java.util.*;
import csw2.chapter1.LinearSearch;

public class searchApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter " + n + " array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the element to search:");
		int s = sc.nextInt();

		LinearSearch obj = new LinearSearch();
		obj.search(a, s);
		sc.close();

	}

}
