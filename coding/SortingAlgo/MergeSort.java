package com.array.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	static void divide(int[] arr, int low , int high) {
		if(low>=high) {
			return ;
		}
		int mid=low+(high-low)/2;
		divide(arr ,low ,mid);
		divide(arr,mid+1,high);
		merge(arr ,low ,mid ,high);
		
	}
	static void merge(int[] arr, int low,int mid, int high) {
		int left = low, right = mid + 1;
	    List<Integer> list= new ArrayList<Integer>();
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				list.add(arr[left]);
				left++;
			} else {
				list.add(arr[right]);
				right++;
			}
		}
		while(left<=mid) {
			list.add(arr[left]);
			left++;
		}
		while(right<=high) {
			list.add(arr[right]);
			right++;
		}
		for(int i=low;i<=high;i++) {
			arr[i]=list.get(i-low);
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		divide(arr,0 ,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
