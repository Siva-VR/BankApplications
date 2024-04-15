package com;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplictes {

	    public static void main(final String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Number of Elements");
	    	int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter "+n+" elements");
	        for (int i =0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
	        Arrays.sort(arr);
	        int t =0;
	        for(int i=0;i<arr.length;i++) {
	        	for (int j = 1; j < arr.length-i; j++) {
					if(arr[i]>arr[j]) {
						t=arr[i];
						arr[i]=arr[j];
						arr[i]=t;
					}
				}
	        }
	        
	        for (int i=0;i<arr.length;i++) {
	        	System.out.println(arr[i]);
	        }
	        RemoveDuplictes.removeDuplicates(arr);
	    }
	    public static void removeDuplicates(int arr[]) {
        	int temp[]= new int[arr.length];
        	int j=0;
        	for(int i =0;i<arr.length-1;i++) {
        		if (arr[i]!=arr[i+1]) {
					temp[j++]=arr[i];
				}
        	}
        	temp[j]=arr[arr.length-1];
        	for(int i =0;i<=j;i++) {
        		System.out.print(temp[i]+" ");
        	}
        }

	  
	
}
