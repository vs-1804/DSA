package com.array.sort;

import java.util.Arrays;

public class InsertionSort {
	private static int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { -1, 1, -2, 5, 2, 0 };
		System.out.println(Arrays.toString(sort(arr)));

	}

}
