

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	int[] array;
	int[] tempMergeArr;
	int length;
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
		MergeSort merge = new MergeSort();
		merge.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public void sort(int[] arr) {
		this.array = arr;
		this.length=arr.length;
		this.tempMergeArr=new int[length];
		divideArray(0,length-1);
	}
	public void divideArray(int lowerIndex, int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middle=lowerIndex+(higherIndex-lowerIndex)/2;
			//it will sort the left side of an array
			divideArray(lowerIndex, middle);
			//it will sort the right side of an array
			divideArray(middle+1,higherIndex);
		}
	}
	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for(int i=lowerIndex; i<=higherIndex;i++) {
			tempMergeArr[i]=array[i];
		}
		int i=lowerIndex;
		int j= middle+1;
		int k=lowerIndex;
		while(i<=middle&& j<=higherIndex)
		{
			if(tempMergeArr[i]<=tempMergeArr[j])
			{
				array[k]=tempMergeArr[i];
				i++;
			}
			else
			{
				array[k]=tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(j<=middle)
		{
			array[k]=tempMergeArr[i];
			k++;
			i++;
		}
		
	}
	
	

}
