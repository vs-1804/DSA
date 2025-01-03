package com.test;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr = {4,2,0,3,2,5};
		System.out.println(trapWater(arr));
	}
// better solution store all pillar left ,right max pillar in two array : time:O(N) & space:O(2N) 
	private static int trapWater(int[] arr) {
		int ans=0;
		int[] preLeft=preLeft(arr);
		int[] sufRight=sufRight(arr);
		for(int i=0;i<arr.length;i++) {
			int temp=Math.min(preLeft[i] ,sufRight[i])-arr[i];
			ans=ans+temp;
		}
		return ans;
	}

	static int[] preLeft(int[] arr) {
		int[] temp = new int[arr.length];
		int val = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > val) {
				val = arr[i];
			}
			temp[i] = val;
		}
		return temp;
	}
	
    static int[] sufRight(int [] arr) {
    	int[] temp = new int[arr.length];
		int val = arr[arr.length-1];
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] > val) {
				val = arr[i];
			}
			temp[i] = val;
		}
		return temp;	
	}

}
