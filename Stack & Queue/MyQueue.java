//Ashish Selvaraj 938081
public class MyQueue {

	//Attributes
	StudentInfo frontOfQueue;
	int numInQueue;
	StudentInfo nextStudent;//A variable to hold the next student in the list
	
	
	//Constructors
	MyQueue(){
		
		frontOfQueue=null;//setting defaults
		numInQueue=0;
		nextStudent=null;
	}
	
	
	//Methods
	//Enqueue adds the item to the rear of the queue
	public void enqueue(StudentInfo studentToAdd) {
		
		if(numInQueue==0) {
			frontOfQueue = studentToAdd;//No items in the list so the student becomes the front of queue
			numInQueue=numInQueue+1;
		}
		
		else {
			
			nextStudent = frontOfQueue;
			
			for(int i=0;i<numInQueue;i++) {
				
				if(nextStudent.next == null) {//If there is no item after it that means that its the last item
					nextStudent.next = studentToAdd;//The student becomes the next item in the list
					numInQueue=numInQueue+1;
					
					return;//We need this otherwise it becomes an infinite loop. Since the numInQueue becomes +1 it'll enter the loop again, add the student to the end again, increase numInQueue and so on.
				}
				nextStudent = nextStudent.next;
			}
		}
		
	}
	
	
	//Dequeue removes the item at the front of the queue(the first item that was added)
	public StudentInfo dequeue() {
		
		if(numInQueue==1){
			
			nextStudent = frontOfQueue;
			frontOfQueue=null;//If there was only one item in the list and its removed, now the front of list is null
			numInQueue=0;
			return nextStudent;//return the reference value of the removed item to the caller
		}
		
		else if(numInQueue>1) {
			
			nextStudent = frontOfQueue;//store the reference value of the removed item so that it can be returned
			frontOfQueue =frontOfQueue.next;//Since the first item is being removed the second becomes the front
			numInQueue = numInQueue-1;
			
			return nextStudent;
		}
		
		return null;//If the queue is empty
	}
	
	
	public void displayQueue() {
		
		if(numInQueue>0) {	
			
			System.out.println("The Queue: ");
			nextStudent = frontOfQueue;//Starts at the first item
			
			for(int i=0;i<numInQueue;i++) {//Cycle through the list and print all the items
				
				System.out.println("Student "+(i+1)+": "+nextStudent.firstName+" "+nextStudent.lastName);
				nextStudent = nextStudent.next;
			}
		}
		
		else if(numInQueue==0) {
			System.out.println("The Queue is empty!");
			
		}
		
		else {
			System.out.println("There are a negative number of items in the queue!?!");
		}
		
	}
	
}
