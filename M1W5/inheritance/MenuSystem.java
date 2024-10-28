package inheritance;

import java.util.Scanner;

public class MenuSystem {
	public void printMenu() {
		System.out.println("<===Menu===>\n1.Poori\n2.Dosa\n3.Edly\nCoffee");
	}
	public int readCustomerChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
}
