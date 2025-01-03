package com.test;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public static void main(String[] args) {
		int rowNum=5;
	    pascalTriangle(rowNum);
	}
    /// use formula n-1Cr-1  
	private static void pascalTriangle(int rowNum) {
		List<List<Integer>> result= new ArrayList<List<Integer>>();
		for(int k=1;k<=rowNum;k++) {
		List<Integer> lt = new ArrayList<Integer>();
		long ans = 1;
		lt.add(1);
		for (int j = 1; j < k; j++) {
			ans=ans*(k-j);
			ans=ans/(j);
			
			lt.add((int)ans);
		}
		result.add(lt);
		}
       System.out.println(result);
	}

}