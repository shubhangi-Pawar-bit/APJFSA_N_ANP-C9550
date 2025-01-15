/* 
  lab1_ANP-C9550(Thursday Lab :Familiar with variables and type casting 24-10-2024)
  2..Write program for  narrowing type casting
 
*/
package CoreJava;

public class NarrowingTypeCasting {

	double doubleVar = 85;
	long longVar = 100;
	
	public void TypeCasting() {
		
		// Printing values before type casting
		
		System.out.println("Before Type casting Double : "+doubleVar);
		System.out.println("Before Type casting Long : "+longVar);
		
		
		int a = (int)doubleVar;    // Type casting datatype Double into Integer
		int b = (int)longVar;      // Type casting datatype Long into Integer
		
		
		// Printing values after type casting
		
		System.out.println("After Type casting Double : "+a);
		System.out.println("After Type casting Long : "+b);
		
	}
	
	
	public static void main(String[] args) {
		
		NarrowingTypeCasting obj = new NarrowingTypeCasting();
		
		obj.TypeCasting();

	}
}


/* OUTPUT:
   
  Before Type casting Double : 85.0
  Before Type casting Long : 100
  After Type casting Double : 85
  After Type casting Long : 100

*/ 
