package com.test;

class Solution {
	public static void main(String[] args) {
		int[] arr = {1,8,6,2,5,4,8,2,7};
		System.out.println(containerMaxWater(arr));
	}
//brute force check all pair of boundaries.
	private static int containerMaxWater(int[] arr) {
		int maxWater=0;
		for( int i=0; i<arr.length;i++) {
			int max=0;int len=1;
			for( int j=i+1;j<arr.length;j++) {
				int waterhold=Math.min(arr[i], arr[j])*len;
				len++;
				max=Math.max(max, waterhold);
			}
			//System.out.println(max);
			maxWater=Math.max(max, maxWater);
		}
		
		
		return maxWater;
				
	}
}