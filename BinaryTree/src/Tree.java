class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int d) {
		data = d;
	}
	
	public void display() {
		System.out.print(data + " ");
	}
}

public class Tree {
	public Node root,parent;
	
	public void insert(int d) {
		Node newNode = new Node(d); //create a node object from default constructor
		Node current;
		
		if(root == null) 
			root = newNode;
		else {
			current = root;			
			while(true) {			
				if(d<current.data) { //branch left
					if(current.left == null) {
						current.left = newNode;						
						return;
					}
					else
						current = current.left;
				}
				else { //branch right
					if(current.right == null) {
						current.right = newNode;						
						return;
					}
					else
						current = current.right;
				}
			}
		}
		
	}
	
	private Node find(int d) {
		Node current = root;
		while(true) {
			if(d==current.data) 
				return current;	
			else if(d<current.data){
				if(current.left == null ) 
					return null;
				else
					current = current.left;				
			}
			else {
				if(current.right==null) 
					return null;				
				else
					current = current.right;
			}
				
		}
		
	}
	
	private void inOrder(Node localRoot) {
		
		if(localRoot == null)
			return;
		else {
			inOrder(localRoot.left);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.right);
		}
	}
	
	public void delete(int d) {
		Node current = root;
		Node parent = root;
		boolean found = false;
		
		while(true) {
			if(d==current.data) {
				found = true;
				break;	
			}
			else if(d<current.data){
				if(current.left == null )					
					break;
			
				else {
						parent = current;
						current = current.left;
				}
			}
			else {
				if(current.right==null) 
					break;				
				else {
						parent = current;
						current = current.right;
				}
			}
				
		}
		
		if(!found) {
			System.out.print(d + " was not found in tree\n");
		}
		else {
			
			if(current ==  root) { //the tree has only one node
				root=null;
			}
			else if(current.left == null && current.right == null ) { //node has no children
				if(current == parent.right) //is the right child
					parent.right=null;
				else //is the left child
					parent.left=null;				
			}
			else if(current.left != null && current.right == null) {//node has only the left child
				if(current == parent.right) //is the node to be deleted is the right child
					parent.right=current.left;
				else //is the left child
					parent.left=current.left;					
				
			}
			else if(current.right != null && current.left == null) {//node has only the right child
				if(current == parent.right) //is the node to be deleted is the right child
					parent.right=current.right;
				else //is the left child
					parent.left=current.right;					
			}
			else { //node has two children
				Node succ = successorNode(current);
				if(succ == current.right) { //successor is the node's right child
					succ.left = current.left;
					parent.right = succ;					
				}
				else{				
					System.out.println(current.data+" has two children " + current.left.data + " and " + current.right.data);
 
					
					parent.right = succ;
					succ.left = current.left;

				}			
				
			}
			System.out.println(d + " was deleted from the tree");
		}
	}
	
	public void display() {
		System.out.println("Trasversing inorder...");
		inOrder(root);
		System.out.println("");
	}
	
	public Node maximum(Node localRoot) {
		Node max = localRoot;
		Node curr = localRoot;
		while(curr != null) {
			max = curr;
			curr = curr.right;
		}
		return max;
	}
	public Node successorNode(Node localRoot) {
		Node successorParent = localRoot;	
		Node curr = successorParent.right;
		Node successor = localRoot;
		
		while(curr != null) {
			successorParent = successor;
			successor = curr;
			curr = curr.left;
		}
		System.out.println("successor parent is " + successorParent.data);
		System.out.
		println("successor is " + successor.data);
		System.out.println("current is " + curr);
		
		if(successor != localRoot.right) //if successor not right child of node, cut links
		{
			successorParent.left = successor.right;
			successor.right = localRoot.right;
		}
		
		return successor;
	}
}
