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
		List<Integer> lt = new ArrayList<Integer>();
		long ans = 1;
		lt.add(1);
		for (int j = 0; j < rowNum; j++) {
			ans=ans*(rowNum-j);
			ans=ans/(j+1);
			
			lt.add((int)ans);
		}
       System.out.println(lt);
	}

}