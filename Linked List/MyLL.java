//938081 Ashish Selvaraj
public class MyLL {
	
	
	//Attributes
	public StudentInfo frontOfList; // Point to the student at the front of the list.
	public int numInList; // Number of students in the list.
	public StudentInfo item;//Item(in this case student) at current position in the list.


	
	//Constructor
	public MyLL() {
		// Default to an empty linked list.
		frontOfList = null;
		numInList = 0;
		item=null;
	}
	
	//Methods
	
	//Add a student to the front of a list.
	
	public boolean addToFront(StudentInfo studentToAdd) {
		
		item = frontOfList;//store the item currently at the front so it can be the second item in the new list
		frontOfList = studentToAdd;
		frontOfList.next = item;
		numInList = numInList+1;
		return true;
	}
	
	
	//Add a student to the rear of the list.
	
	public boolean addToRear(StudentInfo studentToAdd) {
		
		if(frontOfList==null) { //Case where the list is empty. The item becomes the front
			frontOfList = studentToAdd;
			numInList = numInList+1;
			return true;
		}
		
		else { //otherwise place the item at the end of the list.
			item = frontOfList;
			
			for(int i=0; i<numInList;i++) {
				
				if(item.next==null) { //this means we've reached the end because there is no next value.
					item.next = studentToAdd;
					numInList = numInList+1;
					return true;
				}
				item = item.next;
			}
		}
		return false;
	}
	
	
	
	//Remove a student from the rear of a list.
	
	public StudentInfo removeFromRear() {
		
		if(numInList>1) {//if list is not empty and has more than one item
			item = frontOfList;
			
			for(int i=0; i<numInList; i++) {
				if(i==numInList-2) {
					StudentInfo reference = item.next;//reference value of item to be re
					item.next=null;//Remove the pointer to the item that you don't want
					numInList = numInList-1;
					return reference;
				}
				item = item.next;
			}
		}
		else if(numInList==1){//if list has only one item
			item = frontOfList;
			frontOfList=null;
			numInList = numInList-1;
			return item;
		}
		return null;//if the list is empty
	}
	
	
	//Remove a student from the front of the list.
	
	public StudentInfo removeFromFront() {
		
		if(numInList>1) {//if the list has more than one item
			item = frontOfList;
			frontOfList=frontOfList.next;//The second item becomes the first item
			item.next=null;//No longer points to the rest of the list.
			numInList = numInList-1;
			return item;
		}
		
		else if(numInList==1){//if the list has one item
			item = frontOfList;
			frontOfList=null;
			numInList = numInList-1;
			return item;
		}
		
		return null;//if the list has no items
	}
	
	
	public boolean sort() {//work in progress
		
		char low=frontOfList.firstName.charAt(0);
		item = frontOfList;
		
		for(int i =0; i<numInList; i++) {
			if(item.next.firstName.charAt(0)<low) {
				StudentInfo temp = frontOfList;
				frontOfList = item.next;
				item.next = temp;
				return true;
			}
			item=item.next;
		}
		return false;
	}
	
	
	public boolean getInfo(StudentInfo someStudent) {
		item = frontOfList;
		
		for(int i=0; i<numInList; i++) {
			
			if(item==someStudent) {//if the item in the list is the item we want
				System.out.println("First Name: "+item.firstName);
				System.out.println("Last Name: "+item.lastName);
				System.out.println("Student Number:"+item.studentNumber);
				System.out.println("Height: "+item.height);
				System.out.println("Weight: "+item.weight);
				return true;
			}
		}
		
		return false;
	}
	
	
	//Display all the items in the list.
	
	public void displayList() {
		
		if (numInList < 0) {
			System.out.println("This linked list has a negative number of items?!!?!??");
		}
		else {
			if (numInList == 0){
				System.out.println("THIS LINKED LIST IS EMPTY!");
			}
			else {
				StudentInfo item = frontOfList;
				
				for(int i=0; i <numInList; i++) {//cycle through all items in the list and print each one
					
					System.out.println("Student "+(i+1)+" "+item.firstName);//The (i+1) allows us to number the students
					item=item.next;
				}
			}
		}
	}
}