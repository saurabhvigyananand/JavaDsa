package Practice;


class Employee{
	
	String name;
	String designation;
	String address;         // Instance variables // member variables
	long mobile;
	String email;
	double salary;
	
	
	// Constructor  -> parameter less
	Employee(){
		// empty
	}
	
	// Parameterized Constructor
	Employee(String name, String designation, String address, long mobile, String email, double salary){
		this.name= name;
		this.designation = designation;
		this.address= address;
		this.mobile= mobile;
		this.email = email;
		this.salary= salary;
	}
	
	
	// function 
	void myDetails() {    // instance/member methods
		System.out.println("My Details:-");
		System.out.println("Name: "+this.name);
		System.out.println("Designation: "+this.designation);
		System.out.println("Address: "+this.address);
		System.out.println("Mobile: "+this.mobile);
		System.out.println("Email: "+this.email);
		System.out.println("Salary: "+this.salary);
	}
}


public class ClassObject {
	
	public static void main(String[] args) {
		
		String name ="anmol";
		Employee emp1 = new Employee();
		emp1.myDetails();
		
		Employee emp2 = new Employee("Vivek","Software Developer","Samastipur, Bihar"
				, 8541962538L, "vkanmol10@gmail.com",100000.0);
	}
}
