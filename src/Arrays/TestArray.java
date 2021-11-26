package Arrays;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		String[]  cars = {"Honda", "BMW", "Ford"};
		Arrays.sort(cars);
		System.out.println("Mang sau khi sap xep: ");
		for (String car : cars ) {
			System.out.println(car);
		}
		int arr[] = {8, 3,6, 9};
		for (int e = 0; e < arr.length; e++) {
			System.out.print(arr[e] + " ");
		}
		System.out.println("Mang da chieu");
		int a[][] = {{1,3,4}, {3,4,6}};
		int b[][] = {{1,3,4}, {2,5,4}};
		int c[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
