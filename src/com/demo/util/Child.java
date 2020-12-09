package com.demo.util;			// current package
import java.util.Scanner;		// import the class Scanner from package java.util

public class Child extends Parent{	// inherited form Parent class
	// method ageRate()
	public void ageRate() {
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("What is your age?");
				// variable age uses object
				age = input.nextInt();	
				
				// send back this massage when age is younger than 18.
				message = "You are a child";
			
			// Conditional if the person is an adult or a child
			if (age >= 18) { 
				// send back this massage when age is 18 or older.
				message = "You are an adult";
			}		
			
			// print message
			System.out.println(message);
		}
	}
}