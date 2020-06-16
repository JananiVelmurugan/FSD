package com.fsd.day2;

import java.util.Scanner;

public class UserStringInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first name");
		String firstName = scanner.next();

		System.out.println("Enter the last name");
		String lastName = scanner.next();

		String fullName = firstName + " " + lastName;
		System.out.println("Hi " + fullName);

		scanner.close();

	}

}
