package com.test;


class Solution {
	public static void main(String[] args) {
		int rowNum=6; int colNum=3;
		System.out.println(pascalTriangle(rowNum, colNum));
	}
    /// use formula n-1Cr-1
	private static int pascalTriangle(int rowNum, int colNum) {
		      int ans=1;
	         for( int i=0;i<colNum-1;i++) {
	        	 ans=(rowNum-1-i)*ans;
	        	 ans=ans/(i+1);
	         }
		      
		    return ans;
		    }
      
}