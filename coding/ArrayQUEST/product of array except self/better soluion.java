package com.test;

import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		productArray(arr);
	}
// best solutiob using 2N space and O(N) time complexity
	private static void productArray(int[] arr) {
		int[] ans= new  int[arr.length];
		int[] pre=new int[arr.length];
		int[] suf=new int[arr.length]; pre[0]=1; suf[suf.length-1]=1;
		for(int i=1;i<pre.length;i++) {
			pre[i]=arr[i-1]*pre[i-1];
		}
		for( int i=arr.length-2;i>=0;i--) {
			suf[i]=arr[i+1]*suf[i+1];
		}
	
		for( int i=0;i<arr.length;i++) {
			ans[i]=pre[i]*suf[i];
		}
		System.out.println(Arrays.toString(ans));
		
				
	}
}