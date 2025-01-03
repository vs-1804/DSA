package com.java;
import java.util.ArrayList;
import java.util.List;

public class QUEST6 {//generate all permutation
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		List<Integer> ds =new ArrayList<Integer>();
		boolean[] freq=new boolean[arr.length];
		permute(arr,ds,ans,freq);	
		System.out.println(ans);
		
}
static void permute(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
	if (ds.size() == arr.length) {
		ans.add(new ArrayList<Integer>(ds));
		return;
	}
	for (int i = 0; i < arr.length; i++) {
		if (!freq[i]) {
			freq[i] = true;
			ds.add(arr[i]);
			permute(arr, ds, ans, freq);
			ds.remove(ds.size() - 1);
			freq[i] = false;
		}
	}
	
}

}
