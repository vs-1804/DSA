package com.array.sort;

import java.util.Arrays;

public class BubbleSort_Recursion {

	static void sort(int[] arr, int n) {

		if (n == 1)
			return;
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				count++;
			}
		}

		if (count == 0)
			return;

		sort(arr, n - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, 5, 4, 5, 2 };
		sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
}
