class PriorityQueue{
	public int nElements;
	private Tree[] array;
	public int maxSize;
	
	public PriorityQueue(int s){ //constructor
		nElements = 0;
		maxSize = s;
		array = new Tree[s]; //array of trees
	}
	
	public boolean isEmpty() {
		return (nElements==-1);
	}
	
	public boolean isFull() {
		return (nElements==maxSize-1);
	}
	
	public Tree remove() {
		return array[--nElements];
	}
	
	public void display() {
		for(int i=0;i<nElements;i++)
			System.out.println(array[i].root.character + ", " + array[i].root.frequency); //display the fields in tree
	}
	

	public void insert(Tree tree) {
		
		
		int i;
			if(nElements == 0)
				array[nElements++] = tree;
			else { 
				for(i=nElements-1; i>=0;i--) { //arrange according to frequency
					if(tree.root.frequency < array[i].root.frequency) {
						array[i+1] = array[i];						
					}
					else
						break;
				}
					array[i+1] = tree; 
					nElements++;
				
			}
		
	}
}
