package com.array.sort;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] arr = {10,111,12,122,132 };
		radixSort(arr);
	}
	static void radixSort(int[] arr) {
		int max = maxNum(arr);
		int[] result = new int[arr.length];
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(arr, result, exp);
	}
		System.out.println(Arrays.toString(result));
		}
    static void countSort(int[] arr, int[] result,int exp) {
		int[] count= new int[10];
		for(int i=0; i<arr.length;i++) {
			
			count[(arr[i]/exp)%10]++;
		}
         for(int i=1; i<arr.length-1;i++) {
			
			count[i]=count[i]+count[i-1];
		}
		for(int i=arr.length-1;i>=0;i--) {
			result[count[(arr[i]/exp)%10]-1]=arr[i];
			count[(arr[i]/exp)%10]--;
		}
	}

	static int maxNum(int[] arr) {
    	int max=0;
      for(int i=0;i<arr.length;i++) {
    	  max=Math.max(max, arr[i]);
      }
		return max;
	}

}
