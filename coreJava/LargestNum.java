/*
   lab3_ANP-C9550(Familiar with Java Operators and conditional statements 01 -11-2024) 
   Q-2) Write a java program to find largest among three numbers.  
*/
package CoreJava;

import java.util.Scanner;                               // Import scanner class

public class LargestNum {

	public static void main(String[] args) {
		
		
		Scanner scc = new Scanner(System.in);            // Creating object of scanner class
		
		
		System.out.println("Enter First Number : ");   
		int num1 = scc.nextInt();                        // input first number from user
		
		System.out.println("Enter Second Number : ");
		int num2 = scc.nextInt();                        // input first number from user
		
		System.out.println("Enter Third Number : ");
		int num3 = scc.nextInt();                        // input first number from user
		 
		
		// If else statements for checking largest number

		if(num1 > num2 && num1 > num3) {
			
			System.out.println(num1+" is largest number");
			
		}else if (num2 > num1 && num2 >num3) {
			
			System.out.println(num2+" is largest number");
			
		}else if(num3 > num1 && num3 > num2) {
			
			System.out.println(num3+" is largest number");
			
		}
		
	}

}

/* OUTPUT : 

	Enter First Number : 
    76
    Enter Second Number : 
    2
    Enter Third Number : 
    19
    76 is largest number

*/

