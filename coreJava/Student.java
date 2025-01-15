/*
    lab9_ANP-C9550(Java Collections and Generics)
    Q-1) Create a Student class and create an array list to add 10 student objects and print them using a for each loop.
 */
package CoreJava;
import java.util.ArrayList;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList to store Student objects
				ArrayList<Student10> students = new ArrayList<>();
				Scanner sc = new Scanner(System.in);

				// Ask user for 10 student names
				for (int i = 1; i <= 10; i++) {
					System.out.print("Enter name for Student " + i + ": ");
					String name = sc.nextLine(); // Read input from user
					students.add(new Student10(name)); // Add student to list
				}

				// Use a for-each loop to print the student names
				System.out.println("\nList of Students:\n");
				for (Student10 student : students) {
					System.out.println(student);
				}

			}
		}
		class Student10{
			String name;
			// Constructor to initialize student name
			Student10(String name) {
				this.name = name;
			}

			// Overriding toString method to print student details
			@Override
			public String toString() {
				return name;
	}

}
		
/* OUTPUT 
  
Enter name for Student 1: Shubhangi 
Enter name for Student 2: Siddhi
Enter name for Student 3: Tanushka
Enter name for Student 4: Aachal
Enter name for Student 5: Harshana
Enter name for Student 6: Akanksha
Enter name for Student 7: Supriya
Enter name for Student 8: Shweta
Enter name for Student 9: Gauri
Enter name for Student 10: Sakshi

List of Students:

Shubhangi 
Siddhi
Tanushka
Aachal
Harshana
Akanksha
Supriya
Shweta
Gauri
Sakshi

*/