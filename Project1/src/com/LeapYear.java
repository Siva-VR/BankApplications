package com;

import java.util.Scanner;

public class LeapYear {
	static boolean leapyear = false;
	static boolean leapYear(int n) {
		if(n%4==0) {
			if(n%100==0) {
				if(n%400==0) {
					leapyear=true;
				}
				else {
					leapyear =false;
				}
			}
			else {
				leapyear=true;
			}
		}else
		{
			leapyear =false;
		}
		return leapyear;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(LeapYear.leapYear(n));
		sc.close();
	}

}
