package com;

import java.util.Scanner;

public class PrintArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" Elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}
