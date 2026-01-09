package basic;

import java.util.Scanner;

public class MinimumBalanceCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount to check balance: ");
		double amount = sc.nextDouble();
		
		if(amount >= 1000) {
			System.out.println("Balance OK.");
		}else {
			System.out.println("Low Balance.");
		}
	}
}
