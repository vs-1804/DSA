package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxProductSubArray(arr);
	}

	private static int maxProductSubArray(int[] nums) {
	
		        if(nums.length==1) return nums[0];
		        int max=0;
		        int pref=1; int suf=1;
		        for( int i=0;i<nums.length;i++){
		            if(pref==0)pref=1;
		            if(suf==0)suf=1;
		            pref=pref*nums[i];
		            suf=suf*nums[nums.length-1-i];
		            max=Math.max(max,Math.max(pref,suf));
		        }
		    return max;
		    }
      
}