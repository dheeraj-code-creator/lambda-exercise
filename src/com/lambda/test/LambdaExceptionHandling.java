package com.lambda.test;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5 };
		int key = 0;
		process(numbers, key, wrapperLambda((k,v)->System.out.println(k+v)));

	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
       for(int i: numbers) {
    	   consumer.accept(i, key);;
       }
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (k,v)->{
			try {
				System.out.println(k/v);
			}catch(Exception e) {
				System.out.println("exception occured" + e.getMessage());
			}
		};
	}
}
