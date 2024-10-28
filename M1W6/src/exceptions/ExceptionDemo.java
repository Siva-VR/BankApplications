package exceptions;

import java.util.LinkedList;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "shiva";

		for (int i = 0; i <= str.length(); i++) {

			//System.out.println(str.substring(i, i + 1));
		}

		LinkedList<String> al = new LinkedList<String>();
			al.add("Siva");
			al.get(1);
			System.out.println(al);*/
	int a = 10;
	int b = 20;
	int product1 = ArithmeticOperations.product(ArithmeticOperations.sum(a, b),ArithmeticOperations.difference(a, b));
	int product2 = ArithmeticOperations.product(ArithmeticOperations.sum(a, b),ArithmeticOperations.difference(a, b));
	int result = ArithmeticOperations.quotient(product1, product2);
	System.out.println(result);
	int ab = Integer.parseInt(null);
	
	}

}
