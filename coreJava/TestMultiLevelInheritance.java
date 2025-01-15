/*
   lab5_ANP-C9550(INHERITANCE - Is -A Java)
   Q-2) Create a program in java to implement multilevel inheritance and hierarchical inheritance . Take classes like : Doctor , Surgeon and Nurse Create methods and show method overriding.
 
 */

package CoreJava;

//Base class Doctor is created

class Doctor {
	public void diagnose() {
		System.out.println(" Diagnosis is done by the doctor");
	}

	public void prescribeMedice() {
		System.out.println(" Medicine is prescribed by doctor");
	}
}

// by using Multilevel inheritance Surgeon class is derived from Doctor class)

class Surgeon extends Doctor {
	public void Surgery() {
		System.out.println(" Surgery is done by the doctor");
	}

	// Overriding diagnose method

	public void diagnose() {
		System.out.println(" The patient is Diagnosed and prepared for surgery");
	}
}

//by using Multilevel inheritance Nurse class is derived from Doctor Class)

class Nurse extends Doctor {
	public void administerMedicine() {
		System.out.println(" Nurse Administering medicine to the patient");
	}

	// Overriding diagnose method
	public void diagnose() {
		System.out.println(" Nurse Assist under doctor in diagnosis");
	}
}

//Test the Multilevel Inheritance and method overriding

public class TestMultiLevelInheritance {
	public static void main(String[] args) {
		Surgeon surgeon = new Surgeon();
		Nurse nurse = new Nurse();

		// Method overriding in Surgeon and Nurse classes
		
		surgeon.diagnose();   // Overridden method in Surgeon
		surgeon.Surgery();

		nurse.diagnose();     // Overridden method in Nurse
		nurse.administerMedicine();
	}
}

/* OUTPUT 
 
   The patient is Diagnosed and prepared for surgery
   Surgery is done by the doctor
   Nurse Assist under doctor in diagnosis
   Nurse Administering medicine to the patient
 
 */
