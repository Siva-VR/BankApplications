package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchTester {
	public void linearSearch(List<Integer> list,int searchItem) {
		boolean notFound =true ;
		for(int i:list) {
			if(i==searchItem) {
				notFound=false;
				System.out.println( "Search Item Found");
				break;
			}
		}
		if(notFound) {
		System.out.println("Search Item not Found");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Item");
		int searchItem = sc.nextInt();
		SearchTester st = new SearchTester();
		st.linearSearch(list, searchItem);
		//String result = st.linearSearch(list,searchItem);
		//System.out.println(result);
		sc.close();
		
	}

}
