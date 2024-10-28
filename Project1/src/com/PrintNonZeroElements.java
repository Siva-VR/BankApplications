package com;

import java.util.Scanner;

public class PrintNonZeroElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Non zero elements of the array");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] % 10 != 0) {
				System.out.println(arr[i]);
			}

		}
	}
}
