/*
 
   lab5_ANP-C9550(INHERITANCE - Is -A Java)
   Q-1)Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes.
 
 */
package CoreJava;

//Class representing an Address

class Address1 {
	private String street;
	private String city;
	private String state;
	private String zipCode;

	// Constructor to initialize Address
	
	public Address1(String street, String city, String state, String zipCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// Getter methods for Address attributes
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	// Method to display address information
	
	public void displayAddress() {
		System.out.println("Street  : " + street);
		System.out.println("City    : " + city);
		System.out.println("State   : " + state);
		System.out.println("Zip Code: " + zipCode);
	}
}

//Test the Address class

public class Address {
	public static void main(String[] args) {
		Address1 address = new Address1("Maparwadi Road", "Ahmednagar", "Maharashtra", "413713");
		address.displayAddress();
	}
}

/* OUTPUT
     
     Street  : Maparwadi Road
     City    : Ahmednagar
     State   : Maharashtra
     Zip Code: 413713

 */
