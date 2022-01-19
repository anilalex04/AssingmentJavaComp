
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static int[] bubbleSort(int arr1[]) {
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - i - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}

		}
		return arr1;
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
		bubbleSort(arr);
		System.out.println("Array after BubbleSort");
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		System.out.println(Arrays.toString(arr));
		scanner.close();
	}

}
