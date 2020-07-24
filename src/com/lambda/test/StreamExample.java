package com.lambda.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// create a array of 5 Person object and assign it to list.
		List<Person> people = Arrays.asList(
				new Person("Dheeraj", "singh", 21),
				new Person("Surbhi", "mayne", 22),
				new Person("Abhay", "singh", 20),
				new Person("Prakash", "Singh", 24),
				new Person("Ankit", "kumar", 25),
				new Person("Rishu", "kumar", 26)
				);
		
		// use stream and iterate parallelli
		people.stream()
		          .filter(p->!p.getFirstName().startsWith("D"))
		          .forEach(p->{
		        	  int age = 10;
		        	  int newAge = p.getAge()+age;
		        	  System.out.println(p.getFirstName()+ " " + p.getLastName() + " " + newAge);
		          });
		
		System.out.println("========================");
		
		List<String> list = people.stream()
		         .filter(p->!p.getFirstName().startsWith("D"))
		         .map(p->p.getLastName().toUpperCase())
		         .collect(Collectors.toList());
		         
		        System.out.println(list);
		
	}	
}
