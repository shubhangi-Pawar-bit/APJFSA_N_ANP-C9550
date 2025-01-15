/*
     lab7_ANP-C9550(Understanding of Java garbage collection and Java boxing ,unBoxing)
     Q-1) Write  a java program for AutoBoxing.
 
*/
package CoreJava;

public class AutoBoxing {

	public static void main(String[] args) {
		
		        //AutoBoxing can be defined as primitive int is automatically converted to Integer object
		        
		        // Implicit AutoBoxing					
				// Here, int is automatically converted to Integer by Java (implicit autoBoxing)
				int i = 20;
				Integer I = i; 

				// Print the value of the primitive and the Integer object
				System.out.println("Implicit AutoBoxing result is : " + I);

				// Explicit AutoBoxing
				// This is explicit autoBoxing (manually converting the int to Integer)
				Integer e = Integer.valueOf(i); 

				// Print the explicitly boxed Integer value
				System.out.println("Explicit AutoBoxing result is : " + e);
	}

}

/* OUTPUT 
  
  Implicit AutoBoxing result is : 20
  Explicit AutoBoxing result is : 20
  
 */
