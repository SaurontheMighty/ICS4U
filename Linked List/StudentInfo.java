import java.lang.Math;

public class StudentInfo {
	
	// Attributes
	
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height; // in cm
	public double weight; // in kg
	public StudentInfo next; // point to next item in a linked list
	
	
	// Constructors
	
	public StudentInfo() {
		studentNumber = -1;
		firstName = "a";
		lastName = "aaa";
		height = -1.0;
		weight = -1.0;
		next = null; // Don't point to any other student by default.
	}
	
	public StudentInfo(int sN, String firstName, String lastName, double h, double w) {
		
		studentNumber = sN;
		this.firstName = firstName;
		this.lastName = lastName;
		height = h;
		weight = w;
		next = null; // Don't point to any other student by default.		
	}
	

	// Methods
	
	public double calcBMI() {
		/*
		double theBMI = weight / Math.pow((height/100.0), 2.0);
		return theBMI;
		*/
		return(weight / Math.pow((height/100.0), 2.0));
	}

}

