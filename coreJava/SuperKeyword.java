/*  lab6_ANP-C9550(Understanding of Overloading , Overriding and use of this, super key words)
    Q-2) Write a Java program  to invoke parent class constructor using super keyword.
*/

package CoreJava;

// Creating an Class called Parent

class Parent{

	// Declaring an default Constructor
	Parent(){

		System.out.println("This is Constructor of Parent class");
	}
}

// Creating an class called Child and extend class Parent in it

class Child extends Parent{
	// Declaring an Default Constructor 

	Child(){

		// Call Parent class's constructor using super(); keyword

		super();

		System.out.println("This is Constructor of Child class");
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		// Creating an Object of Child class

		Child obj = new Child();
	}
}

/*   OUTPUT
  	
  	This is Constructor of Parent class
    This is Constructor of Child class
 
*/



