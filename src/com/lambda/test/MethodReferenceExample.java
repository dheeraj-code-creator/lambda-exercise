package com.lambda.test;

public class MethodReferenceExample {

	public static void main(String[] args) {
		MethodReferenceExample mre = new MethodReferenceExample();
		Thread t = new Thread(MethodReferenceExample::printMessage);
		Thread t1 = new Thread(mre::displayMessage);
		t.start();
		t1.start();
	}

	public static void printMessage() {
		System.out.println("hello example");
	}

	public void displayMessage() {
		System.out.println("world");
	}
}
