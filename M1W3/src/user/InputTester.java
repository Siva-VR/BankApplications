package user;

import java.util.Scanner;

public class InputTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("you are "+age+ " years old.");*/
		System.out.println("Enter your Date of Birth");
		int byr = sc.nextInt();
		int bmon = sc.nextInt();
		int bdate = sc.nextInt();
		int cyr = 2024;
		int cmon = 9;
		int cdate = 23;
		if(bdate>cdate) {
			cdate+=30;
			cmon--;
		}
		if(bmon>cmon) {
			cmon+=12;
			cyr--;
		}
		int calyr = cyr-byr;
		int calmon = cmon-bmon;
		int caldate = cdate-bdate;
		System.out.println("your age is "+calyr+ " years "+calmon+" months "+caldate+" days");
		sc.close();
	}

}
