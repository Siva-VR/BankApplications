package exceptions;

import java.util.Scanner;

public class StringToInt {
	public static int addNumbersToString(int nums[],int i, int j) {
		int length = nums.length;
		if(length ==0) {
			return 0;
		}
		if(i>j) {
			return 0;
		}
		int sum=0;
		for(int k = i ;k<=j;k++) {
			sum += nums[k];
		}
			return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = 1;
		int nums[]= {1,2,3,4,5};
		System.out.println("Enter how many pairs");
		int pairs =sc.nextInt();
		for(int i  =0;i<pairs;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(StringToInt.addNumbersToString(nums,start,end));

		}
		
		
	}
}
