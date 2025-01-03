package com.array.sort;
import java.util.Arrays;

public class QuickSort {

	static void sort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int parition = findpivot(arr, low, high);
		sort(arr, low, parition - 1);
		sort(arr, parition + 1, high);
	}
	static int findpivot(int[] arr, int low, int high) {
		int pivot = low;
		int i = low + 1;
		int j = high;
		while (i < j) {

			while (arr[i] <= arr[pivot] && i < high) {
				i++;
			}
			while (arr[j] >= arr[pivot] && j > low) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j] = temp;
		System.out.println(Arrays.toString(arr));
		return j;
	}
	public static void main(String[] args) {
		int[] arr = { 4,4,1,2,9,7,7,4};
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
