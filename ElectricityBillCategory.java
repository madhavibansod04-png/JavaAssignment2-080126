package basic;

import java.util.Scanner;

public class ElectricityBillCategory {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter your units : ");
		int unit = read.nextInt();
		
		if(unit >= 300) {
			System.out.println("High Usage");
			if(unit >= 101) {
				System.out.println("Medium Ussage");
			}else {
				return;
			}
		}else if(unit <= 100){
			System.out.println("low usage");
		}
		
//		if(unit <= 100) {
//			System.out.println("Low Usage");
//			
//		}else if(unit >= 101){
//			System.out.println("Medium Usage");
//			
//		}else if(unit >=300) {
//			System.out.println("High Usage");
//		}
	}
}
