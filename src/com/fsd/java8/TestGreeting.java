package com.fsd.java8;

public class TestGreeting {
	public void perform(Greeting greeting) {
		greeting.greet();
	}
	public static void main(String[] args) {
		TestGreeting greeter = new TestGreeting();
		Greeting greeting = new GreetingImpl();
		greeter.perform(greeting);
		MyLambda myLambda = ()->System.out.println("Hello World!");
		MyAdd myAdd = a -> System.out.println(a);
	}
}

interface MyLambda {
	void foo();
}
interface MyAdd{
	void  add(int a);
}