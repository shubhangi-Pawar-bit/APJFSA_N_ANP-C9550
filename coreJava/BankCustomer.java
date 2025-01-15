/*
 	lab4_ANP-C9550(Understanding of Java constructors and inheritance 01 -11-2024)
    Q-1)Write a Java program to Create Bankcustomer class with acno,atype,amt fields using constructor overloading.
 
 */

package CoreJava;

class BankCustomer {
	
	// Fields
	private String acno;   // Account number
	private String atype;  // Account type
	private double amt;    // Amount

	// Default constructor
	
	public BankCustomer() {
		this.acno = "Unknown";
		this.atype = "Unknown";
		this.amt = 0.0;
	}

	// Parameterized constructor (all fields)
	
	public BankCustomer(String acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Parameterized constructor (acno and atype only)
	
	public BankCustomer(String acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0; // Default amount
	}

	// Getter methods
	
	public String getAcno() {
		return acno;
	}

	public String getAtype() {
		return atype;
	}

	public double getAmt() {
		return amt;
	}

	// Method to display customer information
	
	public void displayCustomerInfo() {
		
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Amount: " + amt);
	}

	// Main method to test the class
	
	public static void main(String[] args) {
		
		// Using default constructor
		BankCustomer customer1 = new BankCustomer();
		customer1.displayCustomerInfo();

		System.out.println(); // For spacing

		// Using parameterized constructor (all fields)
		BankCustomer customer2 = new BankCustomer("1200974", "Savings", 2098.58);
		customer2.displayCustomerInfo();

		System.out.println(); // For spacing

		// Using parameterized constructor (acno and atype only)
		BankCustomer customer3 = new BankCustomer("5674437", "Checking");
		customer3.displayCustomerInfo();
	}
}

/* OUTPUT:
 
   Account Number: Unknown
   Account Type: Unknown
   Amount: 0.0

   Account Number: 1200974
   Account Type: Savings
 
 */

