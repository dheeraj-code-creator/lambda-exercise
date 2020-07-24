package com.lambda.test;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

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
		
  // for:in loop
		
		for (Person p : people) {
			int num = 10;
			int newAge = p.getAge() + num;
			String name = p.getFirstName().toUpperCase();
			String str = "KK";
			name = name + str;

			if (name.equalsIgnoreCase("DHEERAJKK")) {
				String str1 = name.substring(0, 7);
				System.out.println(str1 + " " + " " + p.getLastName() + " " + newAge);
			} else {
				System.out.println(name + " " + p.getLastName() + " " + newAge);
			}
		}
		System.out.println("##########################");
		
  // lambda forEach loop
		
	//	people.forEach(p->System.out.println(p));
    // 	people.forEach(System.out::println);	
		
		people.forEach(p->{
			int num = 10;
			int newAge = p.getAge() + num;
			String name = p.getFirstName().toUpperCase();
			String str = "KK";
			name = name + str;
			if (name.equalsIgnoreCase("DHEERAJKK")) {
				String str1 = name.substring(0, 7);
				System.out.println(str1 + " " + " " + p.getLastName() + " " + newAge);
			} else {
				System.out.println(name + " " + p.getLastName() + " " + newAge);
			}
		});
		 
	}
}
