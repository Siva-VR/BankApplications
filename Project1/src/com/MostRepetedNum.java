package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepetedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Map<Integer,Integer>m = new HashMap<Integer,Integer>();
		
		for (int i : arr) {
			if(m.get(i)==null) {
				m.put(i, 1);
			}
			else {
				Integer count = m.get(i);
				m.put(i, count+1);
			}
		}
		System.out.println(m);
		int mrp =0;
		int c =0;
		for(Map.Entry<Integer, Integer>mp:m.entrySet()) {
			if(mp.getValue()>c) {
				mrp = mp.getKey();
				c = mp.getValue();
			}	
		}
		System.out.println(mrp);
	}

}
