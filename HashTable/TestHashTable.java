public class TestHashTable {
	
	public static void main(String[] args) {
		MyHashTable newHashTable = new MyHashTable(10);	
		StudentInfo someStudent = new StudentInfo(1, "A", "S", 140.0, 40.0);
		newHashTable.addToTable(someStudent);
		newHashTable.displayTable();
		System.out.println();

		someStudent = new StudentInfo(0, "O", "G", 140.0, 40.0);
		newHashTable.addToTable(someStudent);
		newHashTable.displayTable();
		System.out.println();

		someStudent = new StudentInfo(2, "V", "P", 140.0, 40.0);
		newHashTable.addToTable(someStudent);
		newHashTable.displayTable();
		System.out.println();

		someStudent = new StudentInfo(3, "D", "T", 140.0, 40.0);
		newHashTable.addToTable(someStudent);
		newHashTable.displayTable();
		System.out.println();
		
		newHashTable.removeFromTable(3);
		newHashTable.displayTable();
		System.out.println();

		System.out.println(newHashTable.isInTable(3));
		System.out.println(newHashTable.getFromTable(3));
		System.out.println(newHashTable.getFromTable(1));
	}	
}
