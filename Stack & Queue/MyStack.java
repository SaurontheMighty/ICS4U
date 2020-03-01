//Ashish Selvaraj 938081

public class MyStack {

	//Attributes
	public StudentInfo topOfStack; //Point to the student at the front of the list
	public int numInStack; //The number of students in the stack
	public StudentInfo nextStudent; //A variable to store the next student in the list
		
		
	//Constructor
	public MyStack(){
		
		//set defaults for all the variables
		topOfStack =null;
		numInStack = 0;
		nextStudent =null;
	}
	
	
	//Methods
	//Push: Adds the item to the front of the stack
	public void push(StudentInfo studentToAdd){
		
		if(topOfStack==null) {//If there are no items in the list
			
			topOfStack = studentToAdd;//The new item becomes the topOfStack
			numInStack = numInStack+1;
		}
		
		else {
			
			nextStudent = topOfStack;//Store the current top in a temporary variable
			topOfStack = studentToAdd;//Add the student to the front of the stack
			topOfStack.next = nextStudent;//Add the original list to the end of the new top
			numInStack = numInStack+1;
		}
	}
	
	
	//Pop: Remove the item at the front of the stack
	public StudentInfo pop(){
		
		if(numInStack!=0) {
			
			numInStack = numInStack -1;
			nextStudent = topOfStack;//Store the value of the item to be popped so it can be returned
			topOfStack = topOfStack.next;
			nextStudent.next=null;//Ensure that the popped item's next attribute is null
			
			return nextStudent;
		}
		
		else {//If the stack is empty
			
			return null;
		}
	}
	
	
	//Peek: Get the reference for the item at the front of the stack
	public StudentInfo peek(){
		
		if(topOfStack!=null) {
			
			nextStudent = topOfStack;
			return nextStudent;//Return the item at the top of the stack
		}
		
		else {
			return null;//If the stack is empty
			
		}
	}
	
	
	public void displayStack() {
		
		if(numInStack==0) {
			System.out.println("The Stack is Empty!");
		}
		
		else if(numInStack>0) {
			
			System.out.println("The Stack: ");
			nextStudent = topOfStack;//Starts at the first item
			
			for(int i=0; i<numInStack; i++) {//Cycle through all the items in the stack
				
				System.out.println("Student "+(i+1)+" is "+nextStudent.firstName+" "+nextStudent.lastName);
				nextStudent = nextStudent.next;
			}
		}
		
		else {//numInList <0
			System.out.println("Negative number of items in the Stack!!?!");
		}
	}
	
}
