package user;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTester {
	public static HashSet<Integer> printUniqueValues(ArrayList<Integer> aList) {
		
		HashSet<Integer> numSet = new HashSet<Integer>( aList);
		System.out.println(numSet);
		
		return numSet;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numSet = new HashSet<Integer>();
		numSet.add(35);
		numSet.add(50);
		numSet.add(28);
		numSet.add(65);
		for(Integer n:numSet) {
			System.out.println(n);
		}
		ArrayList<Integer> aList = new ArrayList<Integer>();
			aList.add(11);
			aList.add(11);
			aList.add(12);
			aList.add(13);
			aList.add(12);
		System.out.println(printUniqueValues(aList));
	}

}
