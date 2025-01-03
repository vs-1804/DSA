package com.test;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productArray(arr);
	}
// instead using prefix suffix just apply same logic to ans array

	private static void productArray(int[] arr) {
		int[] ans= new  int[arr.length];
		Arrays.fill(ans, 1);
		for( int i=1 ;i<arr.length;i++) {
			ans[i]=ans[i-1]*arr[i-1];
		}
		int suffix=1;
		for( int i=arr.length-2 ;i>=0;i--) {
			suffix=suffix*arr[i+1];
			ans[i]=ans[i]*suffix;
		}
		
		System.out.println(Arrays.toString(ans));
		
				
	}
}