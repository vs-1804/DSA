package com.java;

import java.util.Arrays;

public class QUEST8 {

	public static void main(String[] args) {
		int[] arr= {2,1,5,3,1};
		nextPermute(arr);	
		System.out.println(Arrays.toString(arr));
}
	private static void nextPermute(int[] arr) {
		int index=-1;
		int n=arr.length;
		for(int i=n-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			reverse(0,arr.length-1,arr);
		}
		for(int i=n-1;i>index;i--) {
			if(arr[i]>arr[index]) {
				swap(i,index,arr);
				break;
			}
		}
		reverse(index+1, arr.length-1, arr);
	}
	private static void reverse(int start,int end,int[] arr) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	static void swap(int i, int j , int[] arr) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}