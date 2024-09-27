package com.java;

import java.util.ArrayList;
import java.util.List;

public class Q1 {//Leader in an array ,An element is a Leader if it is greater than all the elements to its right side.

	public static void main(String[] args) {
		int[] arr = {10, 22, 1, 3, 0, 6};
		System.out.println(leaderArray(arr));
	}

	private static List<Integer> leaderArray(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[arr.length-1]);
		int leader=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>leader) {
				list.add(0, arr[i]);;
				leader=arr[i];
			}
		}
		
		return list;
		
	}
}
