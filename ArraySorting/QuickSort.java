
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
		}
		return low;
	}

	public static void quickSortRecursion(int[] arr, int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}

	public static void printArray(int[] arr) {
		System.out.println("Array after Quick Sort");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lenth of the Array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the Array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Originl Array :");
		System.out.println(Arrays.toString(arr));
		quickSortRecursion(arr, 0, arr.length - 1);
		printArray(arr);
		scanner.close();
	}

}
