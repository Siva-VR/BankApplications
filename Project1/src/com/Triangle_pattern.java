
package com;

public class Triangle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 1; i <=5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
