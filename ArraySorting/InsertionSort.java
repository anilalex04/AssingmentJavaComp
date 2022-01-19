

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	public static int[] insertionOnly(int[] arr) {
		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("original Array :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array after InsertionSort :");
		System.out.println(Arrays.toString(insertionOnly(arr)));
		scanner.close();
	}

}
