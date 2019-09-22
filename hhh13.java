package ch;
import java.util.Scanner;
public class hhh13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lettery pick (two digots): ");
		int guess = input.nextInt();
		int lotteryDigit1=lottery/10;
		int lotteryDigit2=lottery%10;
		int guessDigit1=guess/10;
		int guessDigit2=guess%10;
		System.out.println("The lottery number is"+lottery);
		if(guess==lottery)
			System.out.println("Exact match: you win $10000");
		else if(guessDigit2==lotteryDigit1&&guessDigit1==lotteryDigit2)
			System.out.println("Match all digits:you win $3000");
		else if(guessDigit1==lotteryDigit1
				||guessDigit1==lotteryDigit2
				||guessDigit2==lotteryDigit1
				||guessDigit2==lotteryDigit2)
			System.out.println("Match one digit:you win $1000");
		else
			System.out.println("Sorry,no match");
	}

}
