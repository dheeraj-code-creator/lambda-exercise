package com.lambda.test;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Integer i =20;
		Predicate<Integer> p = a -> i>30;
			System.out.println(p.test(i));
	}

}
