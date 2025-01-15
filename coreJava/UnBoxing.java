/*   lab7_ANP-C9550(Understanding of Java garbage collection and Java boxing , unBoxing)
     Q-2) Write a java program for UnBoxing.
*/

package CoreJava;

public class UnBoxing {

	public static void main(String[] args) {
		
		// AutoBoxing can be defined as Wrapping primitive int into Integer object
		// This is implicitly done in Java (using autoBoxing)
		Integer obj = 20; 

		// Implicit UnBoxing is the Automatic conversion of Integer to int
		// The Integer object 'obj' is automatically unboxed to primitive int known as implicit unboxing
		int a = obj; 
		
		
		System.out.println("Implicit unboxing result is : " + a);

		// Explicit UnBoxingcan be defined as manual collection of the primitive value from Integer using intValue()
		// This is explicit unBoxing, calling intValue() explicitly to get the primitive int
		int b = obj.intValue(); 
		
		System.out.println("Explicit unboxing result is : " + b);
	}
}
/*  OUTPUT 

   Implicit unboxing result is : 20
   Explicit unboxing result is : 20
   
 */
