//Ashish
public class MyBinaryTree {
	
	
	//Attributes
	public StudentInfo root; //Holds the value of the root of the binary tree
	public int numInTree; //Number of items in the tree
	
	
	//Constructors
	MyBinaryTree(){
		
		root = null; //The default root is set to null
		numInTree =0; //The default number of items in the tree is zero
	}
	
	
	//Methods
	public void addToTree(StudentInfo currentNode, StudentInfo studentToAdd){
		if(root==null) { //If there are no items in the tree
			
			root =studentToAdd; // The item becomes the root of the tree
			numInTree=1;
			return;
			
		}
		else {
			
			if(currentNode!=null) { //If there are already items in the tree
				
				if(studentToAdd.studentNumber<currentNode.studentNumber) { //Less to the Left
					
					if(currentNode.left==null) { //If the left of the current node is null add the student
						currentNode.left = studentToAdd;
						numInTree= numInTree+1;
					}
					
					else {
						addToTree(currentNode.left, studentToAdd); //Otherwise go down the subtrees until you find one with a null left value
					}
					
				}
				
				else {
					
					if(currentNode.right==null) { //If the key is greater add it to the right
						currentNode.right = studentToAdd; 
						numInTree= numInTree+1;
					}
					else {
						addToTree(currentNode.right, studentToAdd); //Otherwise go down the subtrees until you find one with a null right value
					}
				}
			}
		}
	}
	
	
	//Searches for the student number in the binary tree using the rule of the tree: Less to the left.
	public StudentInfo searchInTree(StudentInfo currentNode, int studentNum) {
		
		if(studentNum<currentNode.studentNumber) { //If the student you're looking for has a smaller key than the currentnode
			
			if(currentNode.left!=null) { //Just in case the number is really small and not in the tree like 0(if 0 was not in the tree)
				return(searchInTree(currentNode.left,studentNum)); //Keep finding items in the left subtree
			}
			else {
				return null;
			}
		}
		
		else if(studentNum>currentNode.studentNumber) { //If the student you're looking for has a greater key than the currentnode
			
			if(currentNode.right!=null) { //If the number we're looking for is really large and not in the tree like 1000000(if 1000000 is not in the tree)
				return(searchInTree(currentNode.right,studentNum));
			}
			else {
				return null;
			}
		}
		
		if(studentNum==currentNode.studentNumber){ //If the item found in the subtree is the number you're looking for, return the reference value to the caller
			return currentNode;
		}
		return null;//If the student is not in the tree.

	}
	
	
	
	//Inorder
	//The function keeps going down the left subtree until left is null, it then prints the current node and then goes down the right.
	public void inorder(StudentInfo currentroot){
		
		if(numInTree!=0) { //If the tree is empty we should be able to tell the caller that.
			
			if(currentroot!=null) { 
				
				inorder(currentroot.left);
				System.out.print(currentroot.firstName+" ");
				inorder(currentroot.right);
			}
		}
		else {
			System.out.println("This Binary Tree is empty");
		}
	}
	
	
	//Preorder
	//The function prints every item it encounters and goes down the left subtree. On encountering a null value it goes down the left subtree.
	public void preorder(StudentInfo currentroot){
		
		if(numInTree!=0) { //If the tree is empty we should be able to tell the caller that.
			if(currentroot==null) {
				return;
			}
			
			else {
				System.out.print(currentroot.firstName+" ");
				preorder(currentroot.left);
				preorder(currentroot.right);
			}
		}
		else {
			System.out.println("This Binary Tree is empty");
		}
	}
	
	
	//Postorder
	//The item goes down the left subtree until it reaches a null value, it then goes down the right subtree. On reaching a null value in the right subtree it prints out the current node.
	public void postorder(StudentInfo currentroot){
		
		if(numInTree!=0) { //If the tree is empty we should be able to tell the caller that.
			if(currentroot==null) {
				return;
			}
			else {
				
				postorder(currentroot.left);
				postorder(currentroot.right);
				System.out.print(currentroot.firstName+" ");
			}
		}
		else {
			System.out.println("This Binary Tree is empty");
		}
	}
}
