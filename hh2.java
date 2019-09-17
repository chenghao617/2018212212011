package hh;
import java.util.Scanner;
public class hh2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		if(num1<num2){
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.print("What is"+num1+" - "+num2+"?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if(num1-num2==answer)
			System.out.println("you are correct!");
		else{
			System.out.println("your answer is wrong!");
			System.out.println(num1+"-"+num2+"should be"+(num1-num2));
		}
		
	}

}
