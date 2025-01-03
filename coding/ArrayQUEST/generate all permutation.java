package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> ls = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[arr.length];
		// permute(arr,ls,ds,freq);
		permute1(arr, ls, 0);
		System.out.println(ls);

	}

	// using extra space like freq(to store which is taken) and ds to stroe element
	private static void permute(int[] arr, List<List<Integer>> ls, List<Integer> ds, boolean[] freq) {
		if (ds.size() == arr.length) {
			ls.add(new ArrayList<Integer>(ds));
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!freq[i]) {
				ds.add(arr[i]);
				freq[i] = true;
				permute(arr, ls, ds, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;

			}
		}

	}

	private static void permute1(int[] arr, List<List<Integer>> ans, int idx) {
	// without extra space instead of ds we  use same array 
		if (idx == arr.length - 1) {
			List<Integer> ls = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				ls.add(arr[i]);
			}
			ans.add(ls);
			return;
		}
		for (int i = idx; i < arr.length; i++) {

			swap(arr, i, idx);
			permute1(arr, ans, idx + 1);
			// backtracking
			swap(arr, i, idx);

		}
	}

	static void swap(int[] arr, int i, int idx) {
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = temp;
	}

}
