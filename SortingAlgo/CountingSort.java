package com.array.sort;

import java.util.Arrays;

public class CountingSort {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,1,1,1,4,3,2};
		countSort(arr1);
		
	}
	 static void countSort(int[] arr) {
		 int max=0;
		 for(int i=0 ;i<arr.length;i++) {
			 max=Math.max(arr[i],max);
		 }
		int[] temp=new int[max];
		int[] result= new int[arr.length];
		for(int i=0 ;i<arr.length;i++) {
			
			temp[arr[i]-1]+=1;	
		}
         for(int i=1 ;i<temp.length;i++) {
			
			temp[i]=temp[i]+temp[i-1];	
		}
         //start from back make counting sort stable
        for(int i=arr.length-1;i>=0;i--) {
			
			result[temp[arr[i]-1]-1]=arr[i];
			temp[arr[i]-1]-=1;	
		}
        System.out.println(Arrays.toString(result));
	}

}
