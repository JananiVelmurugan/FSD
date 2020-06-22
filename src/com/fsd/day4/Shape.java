package com.fsd.day4;

public abstract class Shape {
	protected String shapeName; 
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	//concrete methods
//	public double calculateArea() {
//		return 0;
//	}
//	
	//abstract methods
	public abstract double calculateArea();
}
