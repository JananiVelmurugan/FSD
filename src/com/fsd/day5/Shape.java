package com.fsd.day5;

public abstract class Shape {
	protected String shapeName; 
	
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	//concrete methods
	public double calculateAreas() {
		return 0;
	}
	
	//abstract methods
	public abstract double calculateArea();
	
	
	public static void main(String[] args) {
		Shape shape;
		
	}
}
