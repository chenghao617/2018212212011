package hh;
import java.util.Scanner;
public class hh4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		if(number % 2==0&&number % 3==0)
			System.out.println(number +" is divisible by 2 and 3.");
		if(number % 2==0||number % 3==0)
			System.out.println(number +" is divisible by 2 or 3.");
		if(number % 2==0^number % 3==0)
			System.out.println(number +" is divisible by 2 or 3,but not both.");
	}

}