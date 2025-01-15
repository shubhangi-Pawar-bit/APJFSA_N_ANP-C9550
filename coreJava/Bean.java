/*
 	lab2_ANP-C9550(Java Bean)
 	Q-2) Create the bean class using Employee details(EmpId,EmpName,EmpAge,Empsalary)
 */
package CoreJava;

// Employee class implementing Serializable interface for object serialization
class Employee implements java.io.Serializable {
    
    // Private properties for encapsulation
    private int EmpId;  
    private String EmpName;
    private int EmpAge;
    private int Empsalary;
    
    // Default constructor
    public Employee() {}

    // Getter and Setter for EmpId
    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    // Getter and Setter for EmpName
    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    // Getter and Setter for EmpAge
    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int empAge) {
        EmpAge = empAge;
    }

    // Getter and Setter for Empsalary
    public int getEmpsalary() {
        return Empsalary;
    }

    public void setEmpsalary(int empsalary) {
        Empsalary = empsalary;
    }
}

// JavaBeanExample class with main method to test the Employee bean
public class Bean {
    public static void main(String args[]) {  
        
        // Creating an instance of Employee
        Employee obj = new Employee();
        
        // Setting and printing Employee ID
        obj.setEmpId(1212);
        System.out.println("Employee ID: " + obj.getEmpId());
        
        // Setting and printing Employee Name
        obj.setEmpName("Shubhangi Pawar");
        System.out.println("Employee Name: " + obj.getEmpName());
        
        // Setting and printing Employee Age
        obj.setEmpAge(21);
        System.out.println("Employee Age: " + obj.getEmpAge());
        
        // Setting and printing Employee Salary
        obj.setEmpsalary(120780);
        System.out.println("Employee Salary: " + obj.getEmpsalary());
    }
}


/*OUTPUT:
 
	Employee ID: 1212
	Employee Name: Shubhangi Pawar
	Employee Age: 21
	Employee Salary: 120780

*/
