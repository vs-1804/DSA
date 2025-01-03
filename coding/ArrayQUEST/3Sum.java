package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[] arr = {-2,0,0,2,2};
		threeSum(arr);
	}
// three sum using pointer
	private static void threeSum(int[] arr) {
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
	     Arrays.sort(arr);
	     for(int i=0;i<arr.length;i++) {
	    	if(i>0 && arr[i]==arr[i-1]) continue; 
	    	int j=i+1; int k=arr.length-1;
	    	while(j<k) {
	    		int sum=arr[i]+arr[j]+arr[k];
	    		if(sum==0) {
	    			List<Integer> lt= new ArrayList<Integer>();
	    			lt.add(arr[i]);
	    			lt.add(arr[j]);
	    			lt.add(arr[k]);
	    			ans.add(lt);
	    			j++;
	    			while(arr[j]==arr[j-1] && j<k) j++;
	    			k--;
	    			while(arr[k]==arr[k+1] && j<k) k--;
	    		}
	    		else if(sum>0) {
	    			k--;
	    		}
	    		else {
	    			j++;
	    		}
	    	}
	     }
	     System.out.println(ans);
	    
		
				
	}
}