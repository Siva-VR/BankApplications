package com;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "13246879463";
		int sz=s.length();
		char ch[]=s.toCharArray();
		int arr[]=new int[sz];
		for(int i=0;i<sz;i++) {
			arr[i]=ch[i]-'0';
			//System.out.println(arr[i]);
		}
		int sum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			sum +=arr[i]-arr[i+1];
		}
		System.out.println(sum);
		
	}

}
