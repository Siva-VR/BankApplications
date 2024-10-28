package user;

public class Factorial {
	static int result;
	public static int sum(int n) {
		if(n==1) {
			return 1;  
		}else {
			 result = n+sum(n-1);
		}
			return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
