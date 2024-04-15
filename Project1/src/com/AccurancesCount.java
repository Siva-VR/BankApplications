package com;

public class AccurancesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Siva";
		char []arr = name.toCharArray();
		int count = 1;
		for(int i = 0;i<arr.length;i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j+1]) {
					count++;
				}
			}
			System.out.println();
		}
		
	}

}
