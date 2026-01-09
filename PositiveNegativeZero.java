package basic;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter the value : ");
		int num = read.nextInt();
		
		if(num == 0) {
			System.out.println("Integer is Zero");
		}else if(num > 0) {
			System.out.println("Integer is Positive");
		}else if(num < 0) {
			System.out.println("Integer is Negative");
		}
	}
}