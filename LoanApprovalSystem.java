package basic;

import java.util.Scanner;

public class LoanApprovalSystem {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Age : ");
		int age = read.nextInt();
		
		System.out.print("Monthly Salary : ");
		int salary = read.nextInt();
		
		System.out.print("Credit Score : ");
		int credit = read.nextInt();
		
		if(age >= 21) {
			if(salary >= 25000) {
				if(credit >= 700) {
					System.out.println("Loan Aproved!");
				}
				else {
					System.out.println("Loan Rejected due to less Cedit Score");
				}
			}else {
				System.out.println("Loan Rejected due to less Salary");
			}
		}else {
			System.out.println("Loan Rejected!");
		}
	}
}
