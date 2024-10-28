package user;

public class FactorsCount {
	public static int countFactorsofNumber(int num) {
		int i = 2, count = 1;
		while (i <= num / 2) {
			if (num % i == 0) {
				count++;
			}
			i++;

		}
		return count+1;
	}
	public static String isPrime(int factCount)
	{
		if(factCount==2) {
			return "Prime";
		}else {
			return "Not Prime";
		}
	}
	public static int sum( int n) {
		if(n==1) {
			return 1;  
		}else {
			return n+sum(n-1);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countFactorsofNumber(9));
		//System.out.println(isPrime(countFactorsofNumber(17)));
		//System.out.println(isPrime(countFactorsofNumber(16)));
		System.out.println(sum(50));
	
	}

}
