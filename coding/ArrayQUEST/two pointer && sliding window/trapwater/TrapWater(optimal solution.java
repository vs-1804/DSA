package com.test;

class Solution {
	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trapWater(arr));
	}
// optimal solution two pointer solution
	private static int trapWater(int[] arr) {
		int left=0; int right=arr.length-1; int res=0;
		int leftMax=0; int rightMax=0;
		while(left<=right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>=leftMax) {
					leftMax=arr[left];
				}
				else {
					res+=leftMax-arr[left];
				}
				left++;
			}
			else {
				if(arr[right]>=rightMax) {
					rightMax=arr[right];
				}
				else{
					res+=rightMax-arr[right];
				}
				right--;
			}
		}
		return res;
				
	}
}