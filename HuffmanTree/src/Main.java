
public class Main {

	public static void main(String[] args) {
		
		PriorityQueue pQ = new PriorityQueue(10);
		
		
		pQ.insert(new Tree(new Node('s',6)));
		pQ.insert(new Tree(new Node('u',1)));
		pQ.insert(new Tree(new Node('i',2)));
		pQ.insert(new Tree(new Node('e',2)));
		pQ.insert(new Tree(new Node('a',2)));
		pQ.insert(new Tree(new Node('y',2)));
		pQ.insert(new Tree(new Node(' ',3)));
		pQ.insert(new Tree(new Node('\n',1)));
		pQ.insert(new Tree(new Node('t',1)));
		
		pQ.display();
		
		Tree tTemp1, tTemp2;
		
	while(pQ.nElements>1) {	
		tTemp1 = pQ.remove();
		tTemp2 = pQ.remove();
		
		Node node = new Node(' ',tTemp1.root.frequency+tTemp2.root.frequency);
		node.left = tTemp1.root;
		node.right = tTemp2.root;
		
		pQ.insert(new Tree(node));
		
		System.out.println("New tree..");
		pQ.display();
	}
	
	Tree myTree = pQ.remove();
	Node root = myTree.root;
	System.out.println("Traversing tree..");
	myTree.traverse(root);
	}

}
