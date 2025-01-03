package com.test;

class Solution {
	//just find one point where current element is smaller than next;
	//if no element found rverse array and return
	// else swap the finded element with nearest greater element
	//reverse the array from index greater than swaped element index;
	
	void nextPermutation(int[] arr) {
		int index = -1;
		int n = arr.length;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			int i = 0;
			int j = n - 1;
			reverse(arr, i, j);
			return;
		}
		for (int i = n - 1; i > index; i--) {
			if (arr[i] > arr[index]) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				break;
			}
		}
		reverse(arr, index + 1, n - 1);

	}

	void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
