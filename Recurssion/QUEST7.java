package com.java;

import java.util.ArrayList;
import java.util.List;

public class QUEST7 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		permute(0,arr,ans);
		System.out.println(ans);
}
	private static void permute(int index,int[] arr,List<List<Integer>> ans) {
		if(index==arr.length) {
			List<Integer> list= new ArrayList<Integer>();
			for( int i=0;i<arr.length;i++) {
				list.add(arr[i]);
			}
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i=index;i<arr.length;i++) {
			swap(i,index, arr);
			permute(index+1, arr, ans);
			swap(i,index, arr);	
		}
	}
	private static void swap(int i, int j, int[] arr) {
		int a=arr[i];
		arr[i]=arr[j];
		arr[j]=a;
	}
}
