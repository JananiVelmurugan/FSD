package com.fsd.day4;

public class Square extends Shape {
	private int side;

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	public double calculateArea() {
		return side * side;
	}
}
