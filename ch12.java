package ch;
import java.util.Scanner;
public class ch12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate,e.g., 7.25: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 2000;
		System.out.print("Enter number of years as an integer ,e.g., 5: ");
		int number0fYears = input.nextInt();
		System.out.print("Enter number of years as an integer, e.g.,120000.95: ");
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount*monthlyInterestRate /(1-1/Math.pow(1+monthlyInterestRate, number0fYears*12));
		double totalPayment = monthlyPayment*number0fYears*12;
		System.out.println("The monthly payment is $"+(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $"+(int)(totalPayment * 100)/100.0);
	}

}
