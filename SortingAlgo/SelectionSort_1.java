package com.array.sort;

import java.util.Arrays;
//Slightly improves on selection Sort
//with  small element we also find max element and placed at their sorted position;

public class SelectionSort_1 {

	private static int[] sort(int[] arr) {

		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int min_index = i;
			int max_index = j;
			for (int k = i + 1; k < j; k++) {
				if (arr[k] < arr[min_index]) {
					min_index = k;
				}
				if (arr[k] > arr[max_index]) {
					max_index = k;
				}
			}
			if (i != min_index) {
				int temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
			if (j != max_index) {
				int temp = arr[j];
				arr[j] = arr[max_index];
				arr[max_index] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, -4, 5, 0 };
		System.out.println(Arrays.toString(sort(arr)));

	}
}
