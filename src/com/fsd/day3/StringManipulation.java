package com.fsd.day3;

public class StringManipulation {
	public static void main(String[] args) {
		String name = "Rakshith";
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
//		System.out.println(name.charAt(9));//StringIndexOutOfBoundsException
		System.out.println(name.indexOf('h'));
		System.out.println(name.lastIndexOf('h'));
		System.out.println(name.indexOf('j'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
