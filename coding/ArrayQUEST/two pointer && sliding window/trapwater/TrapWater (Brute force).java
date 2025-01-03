package com.test;

class Solution {
	public static void main(String[] args) {
		int[] arr = {4,2,0,3,2,5};
		System.out.println(trapWater(arr));
	}
/// brute force solution count every pillar hold capacity :O(n^2)
	private static int trapWater(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			int temp=Math.min(left(i, arr), right(i, arr))-arr[i];
			ans=ans+temp;
		}
		return ans;
	}
// find left big pillar
    static int left(int i ,int [] arr) {
    	int temp=arr[i];
    	for(int j=i-1;j>=0;j--) {
    		if(arr[j]>temp) {
    			temp=arr[j];
    		}
    	}
		return temp;	
	}
//find right big pillar
    static int right(int i ,int [] arr) {
    	int temp=arr[i];
    	for(int j=i+1;j<arr.length;j++) {
    		if(arr[j]>temp) {
    			temp=arr[j];
    		}
    	}
		return temp;	
	}

}
