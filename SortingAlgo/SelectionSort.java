package com.array.sort;

import java.util.Arrays;

public class SelectionSort {

	 static int[] sort(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {9,2,1,7,6};
		System.out.println(Arrays.toString(sort(arr)));

	}
}
