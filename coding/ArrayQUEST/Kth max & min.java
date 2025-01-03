package com.test;


import java.util.Collections;
import java.util.PriorityQueue;
public class Test4 {
	static int k_largest(int[] arr ,int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>(); 
		for(int x: arr) {
			pq.add(x);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.peek();
	}
	 static int k_smallest(int[] arr , int k) { 
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0; i<arr.length;i++) {
			queue.add(arr[i]);
			if(queue.size()>k) {
				queue.poll();
			}
		}		
		return queue.peek();
	}
	public static void main(String[] args) {
		int[] arr= {3,5,2,1,6,8};
		System.out.println(k_largest(arr,2));
		System.out.println(k_smallest(arr, 2));
		
	}

}
