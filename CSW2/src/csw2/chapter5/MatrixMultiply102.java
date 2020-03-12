package csw2.chapter5;

import java.util.*;

public class MatrixMultiply102 {

	public static void multiply(int[][] m1, int[][] m2) {
		int m1rows = m1.length;
		int m1cols = m1[0].length;
		int m2rows = m2.length;
		int m2cols = m2[0].length;
		if (m1cols != m2rows)
			throw new IllegalArgumentException("matrices don't match: " + m1cols + " != " + m2rows);
		int[][] result = new int[m1rows][m2cols];
		// multiply
		for (int i = 0; i < m1rows; i++) {
			for (int j = 0; j < m2cols; j++) {
				for (int k = 0; k < m1cols; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		print(result);
	}

	public static void print(int[][] a) {
		int rows = a.length;
		int cols = a[0].length;
		System.out.println("Array of [" + rows + "][" + cols + "] = ");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++)
				System.out.print(a[i][j] + " ");

			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first matrix:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the size of the second matrix:");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();

		int a[][] = new int[m][n];
		int b[][] = new int[m1][n1];

		if (n != m1) {
			System.out.println("Invalid Entry");
		} else {
			System.out.println("Enter elements for first matrix: ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					System.out.println("Enter element: {" + i + ", " + j + "}");
					a[i][j] = sc.nextInt();
				}
			}

			System.out.println("Enter elements for second matrix: ");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n1; j++) {
					System.out.println("Enter element: {" + i + ", " + j + "}");
					b[i][j] = sc.nextInt();
				}
			}

			multiply(a, b);
		}
	}

}
