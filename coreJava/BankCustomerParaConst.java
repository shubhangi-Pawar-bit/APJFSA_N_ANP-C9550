/*
  	lab2_ANP-C9550(Java Bean) 
	Q-1) Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor?
*/
package CoreJava;

public class BankCustomerParaConst {
	// Fields
	private int acno;
	private String atype;
	private double amt;

	// Default Constructor
	public BankCustomerParaConst() {
		this.acno = 0;
		this.atype = "Unknown";
		this.amt = 0.0;
	}

	// Constructor with account number and account type
	public BankCustomerParaConst(int acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0; // Default amount set to 0.0
	}

	// Constructor with all fields
	public BankCustomerParaConst(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Method to display customer details
	public void displayCustomerDetails() {
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Amount: " + amt);
	}

	public static void main(String[] args) {
		// Creating objects using different constructors
		BankCustomerParaConst obj1 = new BankCustomerParaConst();
		BankCustomerParaConst obj2 = new BankCustomerParaConst(988677, "Checking");
		BankCustomerParaConst obj3 = new BankCustomerParaConst(100987, "Savings", 1287.45);

		// Displaying the details of each customer
		System.out.println("Customer 1 Details:");
		obj1.displayCustomerDetails();

		System.out.println("Customer 2 Details:");
		obj2.displayCustomerDetails();

		System.out.println("Customer 3 Details:");
		obj3.displayCustomerDetails();
	}
}

/*  OUTPUT:
 
	Customer 1 Details:
	Account Number: 0
	Account Type: Unknown
	Amount: 0.0
	Customer 2 Details:
	Account Number: 988677
	Account Type: Checking
	Amount: 0.0
	Customer 3 Details:
	Account Number: 100987
	Account Type: Savings
	Amount: 1287.45


*/

