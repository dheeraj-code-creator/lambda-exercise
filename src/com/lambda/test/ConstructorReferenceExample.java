package com.lambda.test;

public class ConstructorReferenceExample {

	// lambda function
	
/*	public static void main(String[] args) {
		A a = (x, y) -> {
			return new Student(x, y);
		};

		System.out.println(a.getInfo("Dheeraj", "21"));
	}
*/	 
	// consturctor reference
	public static void main(String[] args) {
        A a = Student::new;
        System.out.println(a.getInfo("Surbhi", "42"));
	}

}

interface A{
	public Student getInfo(String name, String age);
}

class Student{
	private String name;
	private String age;
	
	Student(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	 @Override public String toString() { 
		  return "name=" + name + " age=" +age; 
     }
	
}