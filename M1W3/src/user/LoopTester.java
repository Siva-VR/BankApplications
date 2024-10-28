package user;

public class LoopTester {
	public static void print1To10() {
		int start=1,end =10;
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}
	public static void print1To100() {
		int start=1,end=100;
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}
	public static void print10To50() {
		int start=10,end=50;
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}
	public static void printNegative10To10() {
		int start=-10,end=10;
		while(start<=end) {
			System.out.println(start);
			start++;
		}
	}
	public static void printAtoZ() {
		char start = 'A',end = 'Z';
		while(start<=end) {
			System.out.print(start );
			if(start!=end) {
				System.out.print(", ");
			}
			start++;
			
		}
		
				}
	public static void print10To1() {
		int start=1,end =10;
		while(end>=start) {
			System.out.println(end);
			end--;
		}
		

	}
	public static  int countFactorsofNumber(int num) {
		int i=1,count=1;
		while(num%i==0&&i<=num/2) {
			count++;
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countFactorsofNumber(9)); 
		printAtoZ();
		print1To10();
		LoopTester.print1To100();
		print10To50();
		printNegative10To10();
		LoopTester.print10To1();
	}

}
