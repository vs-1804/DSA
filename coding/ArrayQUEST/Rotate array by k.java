package com.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		rotateByk1(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateByk(int[] arr, int k) {//// using k extra space;
		k = k % arr.length;
		int temp[] = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		for (int j = k; j < arr.length; j++) {
			arr[j - k] = arr[j];
		}
		for (int i = arr.length - k; i < arr.length; i++) {
			arr[i] = temp[i - (arr.length - k)];

		}
	}

	private static void rotateByk1(int[] arr, int k) { // using to extra space
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, k - 1);// rotate 0 to k-1
		reverse(arr, k, n - 1);//rotate  k to n-1
		reverse(arr, 0, n - 1);//rotate whole array

	}

	static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}