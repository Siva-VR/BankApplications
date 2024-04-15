package com;

import java.util.Scanner;

public class AsciValue {
	private static int asciValue(char ch) {
		int a = ch;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("Asci Value of "+ch+" "+AsciValue.asciValue(ch));
	}

}
