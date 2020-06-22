package com.fsd.day6;

public class ExceptionDemo {
	public static void main(String[] args) {

		int[] number = { 12, 45, 67 };
		try {
			System.out.println(number[9]);
		} catch (Exception e) {
			System.out.println("No such index");
		} finally {
			System.out.println("Hello All");
		}
		System.out.println("Geo".charAt(4));

	}

}
