package com.demo.running;		// current package
import com.demo.util.Child;		// import class Child from package com.demo.util

public class Person extends Child {		// inherited from Child class
	// run the program through main(String[] args) method
	public static void main(String[] args) {	
		// create new object
		Person person1 = new Person();
		
		// use object along with the ageRate() method
		person1.ageRate();
	}
}
