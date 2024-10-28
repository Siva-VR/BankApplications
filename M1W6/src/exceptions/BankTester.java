package exceptions;


public class BankTester
{
   public static void main(String[] args)
   {
      test(1000, 10);
      System.out.println("Expected: constructed");
      test(-1000, 10);
      System.out.println("Expected: illegal argument");
      test(1000, -10);
      System.out.println("Expected: illegal argument");
   }
   
   public static void test(double initialBalance, double rate)
   {
	   BankAccount account = new BankAccount(initialBalance, rate);
      System.out.println("balance"+account.getBalance());
      System.out.println("Constructed");
   }
}