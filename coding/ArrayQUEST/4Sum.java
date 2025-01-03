package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[] arr = {1000000000,1000000000,1000000000,1000000000 };
		fourSum(arr,-294967296);
	}
// three sum using pointer
	private static void fourSum(int[] arr, int target) {
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
	     Arrays.sort(arr);
	     for(int i=0;i<arr.length;i++) { 
	    	 if(i>0 && arr[i]==arr[i-1]) continue;
	    	 for( int j=i+1;j<arr.length;j++) {
	    		 if(j>i+1 && arr[j]==arr[j-1]) continue;
	    		 int k=j+1; int l=arr.length-1;
	    		 while(k<l) {
	    			 long sum=arr[i];
	    			 sum+=arr[j];
	    			 sum+=arr[k];
	    			 sum+=arr[l];
	    			 if(sum==target) {
	    				 List<Integer> lt=List.of(arr[i],arr[j],arr[k],arr[l]);
	    				 ans.add(lt);
	    				 k++;
	    				 l--;
	    				 while(arr[k]==arr[k-1] && k<l) k++;
	    				 while(arr[l]==arr[l+1] && k<l) l--;
	    			 }
	    			 else if(sum<target) {
	    				 k++;
	    			 }
	    			 else {
	    				 l--;
	    			 }
	    		 }
	    	 }
	     
	    	 }
	     
	     
	     System.out.println(ans);
	    
		
				
	}
}