package com;

import java.util.Arrays;

public class helllo {
	 public static final void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		int j = arr.length-1;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i>j) {
				break;
			}
			else {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	 
	 
}
