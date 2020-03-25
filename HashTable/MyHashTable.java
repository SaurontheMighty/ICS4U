import java.util.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is a StudentInfo
	// object holding a reference value pointing to a student.

	public ArrayList<StudentInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS
	// All the functions make use of the other functions of the hash table to reduce code redundancy.
	

	public int calcBucket(int studentNumber) {
		return(studentNumber % buckets.length); //calcBucket uses the hashing algorithm in this case modulus to decide the bucket.
	}


	public void addToTable(StudentInfo theStudent) {
		// Add the student referenced by theStudent to the hash table.
		buckets[calcBucket(theStudent.studentNumber)].add(theStudent); //addToTable adds the user to the appropriate bucket which it finds by calling calcBucket.
	}

	

	public StudentInfo removeFromTable(int studentNumber) {
		// Remove that student from the hash table and return the reference value for that student.
		// Return null if that student isn't in the table.
		
		if(isInTable(studentNumber)==true) { //It is only possible to remove a student from the table if they are in the table.
			
			int j = calcBucket(studentNumber); // Creating a separate variable to store the bucket so that it's easier to read.
			
			StudentInfo removedStudentsReference = getFromTable(studentNumber); //Get the reference number before removing the student so that it can be returned to the caller.
			
			buckets[j].remove(removedStudentsReference); //The remove function of an arrayList can be used to remove the item given it's reference value.
			
			return removedStudentsReference; 
		}
		else {
			return null;
		}
	}
	
	
	public StudentInfo getFromTable(int studentNumber) {
		// Return the reference value for that student, return null if student isn't in the table.
		
		int j = calcBucket(studentNumber);
		
		for(int i=0; i<buckets[j].size(); i++) { //Goes through every item in the arrayList n^2 complexity :(
			
			if(buckets[j].get(i).studentNumber==studentNumber) { //If the item at that position is the item we're looking for 
				
				return buckets[j].get(i); //return its reference value to the caller
				
			}
		}
		
		return null; //If it isn't in the table return null to the caller
		
	}

	public boolean isInTable(int studentNumber) {
		// Return true if that student is in the hash table, false otherwise.

		if(getFromTable(studentNumber)!=null) { //If the student's data can be retrieved from the table then we know that the student is in the table
			
			return true;
		}
		
		else {
			
			return false;
		}
	}


	public void displayTable() {
		// Display all the items in the table in some
		// systematic way.
		
		for(int i=0; i<buckets.length; i++) { //Go through every single bucket
			
			for(int j=0; j<buckets[i].size(); j++) { //Go through every single item in the arrayList
				
				System.out.println((buckets[i].get(j)).firstName);
			}
		}
	}


}
