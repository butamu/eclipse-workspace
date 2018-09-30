class Node{
	public char character;
	public int frequency;
	Node left;
	Node right;
	
		public Node(char c, int f) {
		character = c;
		frequency = f;
	}
	
	public void display() {
		System.out.print(character + ", " + frequency);
	}
}                                                                                                                                                                                                                

public class Tree {
	public Node root;	
	public Tree (Node node) {
		root = node; //create new node with the character and frequency
	}
	public void traverse(Node localRoot) {
		
		if(localRoot == null)
			return;
		else {
			traverse(localRoot.left);
			System.out.print(localRoot.character + ", " + localRoot.frequency + " ");
			traverse(localRoot.right);
		}
	}	
	
		
	}
	