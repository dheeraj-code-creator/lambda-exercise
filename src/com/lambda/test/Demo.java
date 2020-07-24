package com.lambda.test;

public class Demo {
	public static void main(String[] args) {
		Greeting g = s-> "Good Evening!!" + s;
		System.out.println(g.greet("Dheeraj"));
	}
}

interface Greeting{
	String greet(String str);
}