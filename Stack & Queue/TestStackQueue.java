//Ashish Selvaraj 938081
public class TestStackQueue {

	public static void main(String[] args) {
		
		//Instantiate the stack and the queue
		MyStack theStack = new MyStack();
		MyQueue theQueue = new MyQueue();
	
		StudentInfo someStudent;

		someStudent = new StudentInfo(111111, "a", "a", 140.0, 40.0);
		System.out.println(theStack.pop());
		theStack.push(someStudent);
		System.out.println(theStack.pop().firstName);
		someStudent = new StudentInfo(111111, "b", "b", 140.0, 40.0);
		theStack.push(someStudent);
		someStudent = new StudentInfo(111111, "c", "c", 140.0, 40.0);
		theStack.push(someStudent);
		someStudent = new StudentInfo(111111, "d", "d", 140.0, 40.0);
		theStack.push(someStudent);
		theStack.displayStack();
		System.out.println(theStack.pop().firstName);
		theStack.displayStack();
		
		

		
		
	}

}
