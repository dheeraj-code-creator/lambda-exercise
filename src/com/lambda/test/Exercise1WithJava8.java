package com.lambda.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1WithJava8 {

	public static void main(String[] args) {

		// create a list of person
		List<Person> people = Arrays.asList(
				new Person("Abhay", "kumar", 22), 
				new Person("Banti", "singh", 23),
				new Person("Dheeraj", "kumar", 24), 
				new Person("Surbhi", "Mayne", 25),
				new Person("Prakash", "singh", 26), 
				new Person("Amit", "singh", 27));

		// sort person with last name and print
		Collections.sort(people, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
		printSortedNames(people);
		System.out.println("--------------------------------------");
		
		// create a method that prints person whose name starting with A
		printConditionallyPerson(people, p-> p.getFirstName().startsWith("B"));
	
	}

	private static void printSortedNames(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printConditionallyPerson(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
	 
}