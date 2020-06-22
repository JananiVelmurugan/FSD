package com.fsd.day6;

public class ExceptionTest {
	public static void main(String[] args) throws InvalidMobileNumberException {
		String mobile = "123456789";
		
		if(mobile.length()!=10) {
			throw new InvalidMobileNumberException("Please enter 10 digit mobile number");
		}else {
			System.out.println("Valid Mobile Number");
		}
	}

}
