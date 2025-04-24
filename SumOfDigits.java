package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int sum=0, num = scanner.nextInt();
		while(num>0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("Sum of the digits is: "+sum);
		
		scanner.close();
		
	}

}
