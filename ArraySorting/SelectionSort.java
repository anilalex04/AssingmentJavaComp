import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
public static int[] selectionOnly(int arr[]) {
	int min, temp=0;
		for (int i = 0; i < arr.length; i++) {
			min =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
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
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Array after Selection Sort :");
		System.out.println(Arrays.toString(selectionOnly(arr)));
		scanner.close();
	}
	

}
