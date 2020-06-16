package com.fsd.day1;

public class BiggestNumber {

	public static void main(String[] args) {
		int lab1 = 30;
		int lab2 = 40;
		int lab3 = 20;
		
	
		if(lab1<lab2 && lab1<lab3) {
			System.out.println("L1 has the minimal seating capacity");
		}else if(lab2<lab3){
			System.out.println("L2 has the minimal seating capacity");
		}else  {
			System.out.println("L3 has the minimal seating capacity");
		}
	}

}
