/*
 
   lab3_ANP-C9550(Familiar with Java Operators and conditional statements 01 -11-2024)
   Q-1) Write a java program to find given no is palindrome or not.
 
 */ 


package CoreJava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// Creating object of Scanner class for taking input from user
		
		Scanner sc = new Scanner(System.in);
		
		// Taking input from user
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		
		int tempNumber = number;				   // Storing input value into temporary variable

		int reversed = 0;                          // initialize variable for store reverse number

		while (number != 0) {
			int temp = number % 10;                // Getting the last digit using % symbol
			reversed = reversed * 10 + temp; 
			number /= 10; 
		}
		
		
		// Checking condition for number is palindrome or not
		
		if(reversed == tempNumber) {
			
			System.out.println("Given Number is Palindrome ");      
			
		}else {
			
			System.out.println("Given Number is Not an Palindrome ");   
			
		}
		
	}

}
/* OUTPUT:
 	(for palindrome number)
 	Enter Number : 
	121
	Given Number is Palindrome
   
    (for Normal number)
    Enter Number : 
    54
    Given Number is Not an Palindrome 
 
*/
