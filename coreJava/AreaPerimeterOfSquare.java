/*
   lab1_ANP-C9550(Thursday Lab :Familiar with variables and type casting 24-10-2024)
   Q-1)Write a Program to Calculate Area and Perimeter of a square. 
 
*/
package CoreJava;

public class AreaPerimeterOfSquare {

	
	// Method for calculating area of square
	public void AreaOfSquare(float side) {
		
		float ans = side*side;   // calculating using formula
		
		System.out.println("Area of Square : "+ans);
		
	}
	
	
	// Method for calculating perimeter of square 
	public void Perimeter(float side) {
		
		float ans = 4*side;     // calculating using formula
		
		System.out.println("Perimeter of Square : "+ans);
		
	}
	
	
	public static void main(String[] args) {
		
		//  Creating an object
		
		AreaPerimeterOfSquare obj = new AreaPerimeterOfSquare();
		
		obj.AreaOfSquare(9);      //  Passing value of side as a parameter  
 		
		obj.Perimeter(9);         //  Passing value of side as a parameter 

	}

}



/* OUTPUT : 
  
  Area of Square : 81.0
  Perimeter of Square : 36.0
  
*/ 

