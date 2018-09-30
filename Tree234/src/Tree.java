
public class Tree {
	Node root = new Node();
	
	public void find(long value) {
		Node current = root;
		int found;
		
		while(current != null) {
			found = current.findItem(value);
			if(found > -1) {
				System.out.println("\n" + value + " was found.");
				return;
			}
			else 
				current = getNextChild(current, value);
				
			}
				
		System.out.println("\n" + value + " was not found.");
		
	}
	
	public Node getNextChild(Node node, long value) {
		int i;
		for(i=0;i<node.nItems;i++) {			
			if(value < node.getItem(i).data) 
				return node.getChild(i);
			
		}
		
		return node.getChild(i);
	}
	
	private void recDisplayTree(Node thisNode, int level, int childnumber) {
		System.out.println("Level "+ level + ", child number " + childnumber);
		thisNode.display(); //display the current node
		for(int i=0;i<thisNode.nItems+1;i++) {//find and display the node's children
			Node tempNode = thisNode.getChild(i);
			if(tempNode != null)
				recDisplayTree(tempNode,level+1,i);
			else
				return;
		}
	}
	
	public void displayTree() {
		recDisplayTree(root,0,0);
	}
	
	public void insert(long value) {
		Node current = root;
		
		while(true) {
			if(current.isFull()){
				split(current); //split the node
				current = current.parent; //step back up
				current = getNextChild(current, value); //search once again
			}
			else if(current.isLeaf()){ //end of tree
				break; //stop there and insert the node
			}
			else
				current = getNextChild(current,value); //search down the tree			
		}
		//finally if current reaches the root
		current.insertItem(new DataItem(value));		
	}
	
	public void split(Node thisNode) {
		Node parent,newNode,child2,child3;
		DataItem itemB, itemC;
		int itemIndex;
		
		newNode = new Node();

		itemC = thisNode.removeItem();
		itemB = thisNode.removeItem(); 
		
		child3 = thisNode.disconnectChild(3);
		child2 = thisNode.disconnectChild(2);
		
		if(thisNode == root) {
			root = new Node();		//create a new root	
			parent = root; //this node becomes child of the new root
			root.connectChild(0, thisNode);	//connect to root as first child
		}
		else 
			parent = thisNode.getParent(); //get this node's parent
		
		//deal with parent first
		itemIndex = parent.insertItem(itemB); //insert B removed from this node to parent
		int n = parent.getNumItems();//how many items does parent have?
		
		//move all parent's connections one child to the right
		for(int i=itemIndex-1;i>n;i--) {
			Node temp = parent.disconnectChild(i);
			parent.connectChild(i+1,temp);
		}
		
		//connect new node to parent
		parent.connectChild(itemIndex+1, newNode);
		
		//now deal with the new node
		newNode.insertItem(itemC);
		newNode.connectChild(0, child2);
		newNode.connectChild(1, child3);
	}
	
	public void traverse(Node localRoot) {
	
		if (localRoot==null)
			return;
		int nItems = localRoot.nItems;
		for(int i=0;i<nItems;i++) {
			traverse(localRoot.childArray[i]);
			localRoot.itemArray[i].display();
			traverse(localRoot.childArray[i+1]);
			}
		
	}
	
	public void inOrder() {
		traverse(root);
	}
}
