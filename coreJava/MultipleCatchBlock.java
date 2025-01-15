/*
 	lab8_ANP-C9550(Thread and Exception Handling) 
    Q-2) Write a program demonstrating multiple catch statements and finally block.
 */
package CoreJava;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			
			// Creating a Scanner object for user input
			Scanner sc = new Scanner(System.in);

			// Input for numerator
			System.out.println("Enter Numerator value: "); 
			int a = sc.nextInt();

			// Input for denominator
			System.out.println("Enter Denominator value: "); 
			int b = sc.nextInt();

			// Attempting division; might throw ArithmeticException if b is 0
			int division = a / b;  
			System.out.println("Division is: " + division);

			// Example array for testing array operations
			int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

			// Taking index input to access the array
			System.out.println("Enter Index of Array: ");
			int index = sc.nextInt();

			// Accessing array element at the given index; might throw ArrayIndexOutOfBoundsException
			System.out.println("The value at Index is: " + arr[index]);

		
		} catch (ArithmeticException e) {
			// Handling division by zero error
			System.out.println("Error: Division By Zero is Not Allowed");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handling invalid array index error
			System.out.println("Error: Invalid array index");
		
		} catch (Exception e) {
			// Handling any other unexpected exceptions
			System.out.println("An Error has occurred: " + e.getMessage());
		
		} finally {
			// Code that always executes, regardless of exceptions
			System.out.println("Execution is done");
		}
	}
}


/* OUTPUT:
 
	Enter Numerator value: 
	10
	Enter Denominator value: 
	4
	Division is: 2
	Enter Index of Array: 
	7
	The value at Index is: 8
	Execution is done

 */

