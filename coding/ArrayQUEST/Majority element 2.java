package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution{//just follow moore's algo but track two element

	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 3, 1, 2, 3 };
		System.out.println(majorityElement(arr));
	}

	private static List<Integer> majorityElement(int[] arr) {
		List<Integer> ls = new ArrayList<Integer>();
		int cnt1 = 0;
		int cnt2 = 0;
		int ele1 = Integer.MIN_VALUE;
		int ele2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (cnt1 == 0 && arr[i] != ele2) {
				ele1 = arr[i];
				cnt1 = 1;
			} else if (cnt2 == 0 && arr[i] != ele1) {
				ele2 = arr[i];
				cnt2 = 1;
			} else if (arr[i] == ele1) {
				cnt1++;
			} else if (arr[i] == ele2) {
				cnt2++;
			} else {
				cnt1--;
				cnt2--;
			}

		}
		cnt1 = 0;
		cnt2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele1) {
				cnt1++;
			}
			if (arr[i] == ele2) {
				cnt2++;
			}
		}
		if (cnt1 > arr.length / 3) {
			ls.add(ele1);
		}
		if (cnt2 > arr.length / 3) {
			ls.add(ele2);
		}
		return ls;

	}

}
