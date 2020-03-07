public class TestBinaryTree {

	public static void main(String[] args) {

		MyBinaryTree theTree = new MyBinaryTree();
		theTree.preorder(theTree.root);
		theTree.inorder(theTree.root);
		theTree.postorder(theTree.root);

		StudentInfo someStudent = new StudentInfo(7,"7","b",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(11,"11","b",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(2,"2","g",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(5,"5","b",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(1,"1","Waldo",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(8,"8","b",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(12,"12","12",100,100);
		theTree.addToTree(theTree.root,someStudent);
		someStudent = new StudentInfo(6,"6","12",100,100);
		theTree.addToTree(theTree.root,someStudent);
		System.out.println("Preorder");
		theTree.preorder(theTree.root);
		System.out.println("\nInorder");
		theTree.inorder(theTree.root);
		System.out.println("\nPostorder");
		theTree.postorder(theTree.root);
		System.out.println("");
		System.out.println(theTree.searchInTree(theTree.root, 1).lastName);
		System.out.println(theTree.searchInTree(theTree.root, 133));
		
	}

}
