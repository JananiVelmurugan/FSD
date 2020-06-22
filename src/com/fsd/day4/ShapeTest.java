package com.fsd.day4;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;

		shape = new Square(2);
		System.out.println(shape.calculateArea());

		shape = new Circle(2);
		System.out.println(shape.calculateArea());

	}

}
