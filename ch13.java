package ch;
import java.util.Scanner;
public class ch13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		int remainingAmount = (int)(amount*100);
		int number0f0neDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int number0fQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int number0fDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int number0fNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int number0fPennies = remainingAmount;
		System.out.println("Your amount "+ amount +" consists of");
		System.out.println(" "+number0f0neDollars+" dollars ");
		System.out.println(" "+number0fQuarters+" quarters ");
		System.out.println(" "+number0fDimes +" dimes ");
		System.out.println(" "+number0fNickels+" nickels ");
		System.out.println(" "+number0fPennies+" pennies ");
		
	}

}
