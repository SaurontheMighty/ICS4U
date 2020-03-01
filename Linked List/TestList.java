//938081 Ashish Selvaraj
public class TestList {

	public static void main(String[] args) {
		
		MyLL theLL = new MyLL(); // Instantiate a linked list.
		
		System.out.println("Brand new linked list!");
		theLL.displayList(); // The list is empty!
		
		StudentInfo someStudent;
		
		boolean addStatus;
		
		
		System.out.println("\nTest #1");
		
		someStudent = new StudentInfo(222222, "Daffy", "Duck", 140.0, 40.0);
		addStatus = theLL.addToRear(someStudent);
		theLL.displayList(); // Only one student in the list.
		
		
		
		System.out.println("\n"+"Test #2");
		
		someStudent = new StudentInfo(888888, "Lola", "Bunny", 160.0, 45.0);
		addStatus = theLL.addToRear(someStudent);
		theLL.displayList(); // Two students in the list.
		
		
		
		System.out.println("\n"+"Test #3");
		
		someStudent = new StudentInfo(333333, "Elmer", "Fudd", 140.0, 40.0);
		addStatus = theLL.addToRear(someStudent);
		
		someStudent = new StudentInfo(444444, "Tweety", "Bird", 160.0, 45.0);
		addStatus = theLL.addToRear(someStudent);
		
		theLL.displayList(); // Four students in the list.
		
		
		
		System.out.println("\n"+"Test #4");
		
		StudentInfo justRemovedStudent;
		
		justRemovedStudent = theLL.removeFromFront();
		if (justRemovedStudent == null) {
			System.out.println("Tried to remove from front of an empty list!\n");
		}
		else {
			System.out.println("Just removed this student from the front of the list:  " + justRemovedStudent.firstName + "\n");
		}
		
		theLL.displayList();
		
		
		
		System.out.println("\n"+"Test #5");
		
		someStudent = new StudentInfo(555555, "Sylvester", "Cat", 140.0, 40.0);
		addStatus = theLL.addToFront(someStudent);
		
		someStudent = new StudentInfo(777777, "Marvin", "Martian", 160.0, 45.0);
		addStatus = theLL.addToFront(someStudent);
		
		theLL.displayList();
		
		
		
		System.out.println("\n"+"Test #6");
		
		justRemovedStudent = theLL.removeFromRear(); // Tweety
		if (justRemovedStudent == null) {
			System.out.println("Tried to remove from rear of an empty list!\n");
		}
		else {
			System.out.println("Just removed this student from the rear of the list:  " + justRemovedStudent.firstName + "\n");
		}
		
		theLL.displayList();
		
		
		
		System.out.println("\n"+"Test #7");
		
		justRemovedStudent = theLL.removeFromRear(); // Elmer
		justRemovedStudent = theLL.removeFromRear(); // Lola
		justRemovedStudent = theLL.removeFromRear(); // Sylvester
		
		theLL.displayList();
		
		
		
		System.out.println("\n"+"Test #8");
		
		justRemovedStudent = theLL.removeFromRear(); // Marvin
		if (justRemovedStudent == null) {
			System.out.println("Tried to remove from rear of an empty list!\n");
		}
		else {
			System.out.println("Just removed this student from the rear of the list:  " + justRemovedStudent.firstName + "\n");
		}
		
		theLL.displayList();
		
		justRemovedStudent = theLL.removeFromRear(); // Trying to remove from empty list!
		if (justRemovedStudent == null) {
			System.out.println("Tried to remove from rear of an empty list!\n");
		}
		else {
			System.out.println("Just removed this student from the rear of the list:  " + justRemovedStudent.firstName + "\n");
		}
		
	}
}