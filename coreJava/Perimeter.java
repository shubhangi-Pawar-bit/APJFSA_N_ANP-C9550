/*
 	lab4_ANP-C9550(Understanding of Java constructors and inheritance 01 -11-2024)
    Q-2) Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
      Formula:
        Perimeter of a square = 4 * s
        Perimeter of a rectangle = 2 * (l + b)
		Perimeter of a circle = 2 * (22/7) * r
*/

package CoreJava;

public class Perimeter {

	// Method to calculate the perimeter of a square
	public double result(double side) {
		return 4 * side;
	}

	// Method to calculate the perimeter of a rectangle
	public double result(double length, double width) {
		return 2 * (length + width);
	}

	// Method to calculate the perimeter of a circle
	public double result(double radius, boolean isCircle) {
		return 2 * Math.PI * radius;
	}

	public static void main(String[] args) {
		// Creating an object of the Perimeter class
		Perimeter obj = new Perimeter();

		// Calculating and displaying the perimeter of a square
		double squarePerimeter = obj.result(15.0);
		System.out.println("Perimeter of the square: " + squarePerimeter);

		// Calculating and displaying the perimeter of a rectangle
		double rectanglePerimeter = obj.result(10.0, 7.0);
		System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

		// Calculating and displaying the perimeter of a circle
		double circlePerimeter = obj.result(10.0, true);
		System.out.println("Perimeter of the circle: " + circlePerimeter);
	}
}

/* OUTPUT:
 
	Perimeter of the square: 60.0
	Perimeter of the rectangle: 34.0
	Perimeter of the circle: 62.83185307179586

*/

