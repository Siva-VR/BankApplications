package user;

import java.util.Scanner;

public class Game {
	public  void gameStart() {
		Scanner sc = new Scanner(System.in);
		int target = 5000;
		int guessNum;
		while(true) {
			System.out.println("Guess the Number");
			guessNum =sc.nextInt();
			if(guessNum==target) {
				System.out.println("Target Found");
				break;
			}
			else if(guessNum<target){
				System.out.println("Your number is less than target");
			}else {
				System.out.println("Your number is higher than target ");
			}
		}
		sc.close();
		
	}

}
