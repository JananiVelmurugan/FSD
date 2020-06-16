package com.fsd.day2;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the input1");
		int input1 = scanner.nextInt();
		
		System.out.println("Enter the input2");
		int input2 = scanner.nextInt();
		
		System.out.println("Enter the input3");
		int input3 = scanner.nextInt();
		
		int result = input1 + input2 + input3;
		System.out.println("Sum is "+ result);
		
		scanner.close();
		
	}

}
