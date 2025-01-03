package com.test;

class Solution {  n/2 times moore's algo
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 1, 2, 2 };
		System.out.println(majorityElement(arr));
	}

	private static int majorityElement(int[] arr) {
		int count = 0;
		int candidate = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (count == 0) {
				candidate = arr[i];
			} else if (arr[i] == candidate) {
				count++;
			} else {
				count--;
			}
		}
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == candidate) {
				count++;
			}
		}
		if (count > arr.length / 2) {
			return candidate;
		} else {
			return -1;
		}

	}

}
