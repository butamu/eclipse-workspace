
public class Main {

	public static void main(String[] args) {
		Tree theTree = new Tree();
		theTree.insert(70);
		theTree.insert(20);
		theTree.insert(30);
		theTree.insert(40);
		theTree.insert(60);
		theTree.insert(25);
		theTree.insert(45);
		theTree.insert(46);
		theTree.insert(50);
//		theTree.insert(75);
		theTree.displayTree();
		
		theTree.inOrder();
		
		theTree.find(60);
		
	}

}
