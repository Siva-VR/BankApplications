package com;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {
	static void duplicates(int temp[]) {
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < temp.length; i++) {
			for (int j = i+1; j < temp.length ; j++) {
				if (temp[i] == temp[ j]) {
					s.add(temp[i]);
				}
			}
		}
		if (!s.isEmpty()) {
			for (Integer i : s) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Duplicates.duplicates(arr);
		sc.close();
	}

}
