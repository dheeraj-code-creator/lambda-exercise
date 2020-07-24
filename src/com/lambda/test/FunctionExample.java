package com.lambda.test;

import java.util.function.Function;

public class FunctionExample {

	
/*	public static void main(String[] args) {
		Function<String, Integer> f = k -> {
			String str = "hello";
			int l = str.length();
			return l;
		};
		System.out.println(f.apply(""));
	}
*/	 
	
	public static void main(String[] args) {
	      Function<String,Integer> f = k->k.length();
	      System.out.println(f.apply("Dheeraj"));
		}

}
