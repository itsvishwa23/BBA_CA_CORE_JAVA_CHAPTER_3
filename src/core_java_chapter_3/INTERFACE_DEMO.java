/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_3;

// Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class TestClass implements In1 {

	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("mes senior college");
	}

	// Driver Code
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}
