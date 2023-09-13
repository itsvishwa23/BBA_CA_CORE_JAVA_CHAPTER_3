/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

// Java Program to Illustrate
// Invocation of Constructor
// Calling Without Usage of
// super Keyword

// Class 1
// Super class
class Base {

	// Constructor of super class
	Base()
	{
		// Print statement
		System.out.println(
			"Base Class Constructor Called ");
	}
}

// Class 2
// Sub class
class Derived extends Base {

	// Constructor of sub class
	Derived()
	{

		// Print statement
		System.out.println(
			"Derived Class Constructor Called ");
	}
}

// Class 3
// Main class
class Demo {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of sub class
		// inside main() method
		Derived d = new Derived();

		// Note: Here first super class constructor will be
		// called there after derived(sub class) constructor
		// will be called
	}
}
