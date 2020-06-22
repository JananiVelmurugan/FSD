package com.fsd.day4;

public class Circle extends Shape {
		private int side;

		public Circle(int side) {
			super("Circle");
			this.side = side;
		}

		public double calculateArea() {
			return side * side * side;
		}
	}


