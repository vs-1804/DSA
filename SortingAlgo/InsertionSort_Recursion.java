package com.array.sort;

import java.util.Arrays;

public class InsertionSort_Recursion {
	
	private static void sort(int[] arr, int n) {
		if (n == arr.length)
			return;

		int j = n - 1;
		int key = arr[n];
		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = key;
		sort(arr, n + 1);

	}

	public static void main(String[] args) {
		int[] arr = { -1, 1, -2, 5, 2, 0 };
		sort(arr, 1);
		System.out.println(Arrays.toString(arr));

	}
}
