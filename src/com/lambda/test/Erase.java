package com.lambda.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Erase {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Abhay", "kumar", 22),
				new Person("Banti", "singh", 23),
				new Person("Dheeraj", "kumar", 24),
				new Person("Surbhi", "Mayne", 25),
				new Person("Prakash", "singh", 26),
				new Person("Amit", "singh", 27)
			);
		// create method and print person starting with P
		
		String s1 = "starting new String";
		//display(s1, s->System.out.println("Hi" + s));
		display(s1, System.out::println);
	}		
		/*printConditionally(people, p->p.getFirstName().startsWith("D"));
		
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}*/
	public static void display(String str, DisplayInterface in) {
		in.takeString(str);
	}
}
interface DisplayInterface{
	public void takeString(String str);
}