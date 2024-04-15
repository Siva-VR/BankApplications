package com;

import java.util.Scanner;

public class VowelOrConsonent {

	public static String vowelOrConsonent(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return "Vowel";
		} else {
			return "Consonent";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(VowelOrConsonent.vowelOrConsonent(ch));
	}

}