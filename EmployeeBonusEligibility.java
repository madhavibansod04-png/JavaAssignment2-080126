package basic;

import java.util.Scanner;

public class EmployeeBonusEligibility {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter your salary : ");
		int salary = read.nextInt();
		
		System.out.print("Enter your Experience : ");
		int exp = read.nextInt();
		
		if(salary >= 30000 && exp >= 3) {
			System.out.println("BONUS ELIGIBLE");
		}else {
			System.out.println("NOT ELIGIBLE");
		}
	}
}
