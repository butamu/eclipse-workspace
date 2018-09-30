
public class Node {
	
	//class fields
	public static final int ORDER = 4;
	Node[] childArray = new Node[ORDER];
	DataItem[] itemArray = new DataItem[ORDER-1];
	int nItems;
	Node parent;
		
	//class methods
	public int findItem(long value) {
		for(int i=0;i<nItems;i++) {
			if(itemArray[i].data==value)
				return i;
		}
		return -1;
	
	}
	
	public void connectChild(int pos, Node child) {
		
			childArray[pos] = child;//connect
			if(child != null)
				child.parent = this;
	}
	
	public Node disconnectChild(int pos) {
		Node tempNode = childArray[pos];
		childArray[pos] = null;//cut link
		return tempNode;
	}
	public Node getParent() {return parent;}
	public Node getChild(int pos) {return childArray[pos];}
	public boolean isLeaf() { return (childArray[0]==null)?true:false;}
	public DataItem getItem(int pos) {return itemArray[pos];}
	public boolean isFull() {return (nItems==ORDER-1)?true:false;}
	public int getNumItems() {return nItems;}
	public DataItem removeItem() {
		DataItem tempItem = itemArray[nItems-1];
		itemArray[nItems-1]=null;
		nItems--;
		return tempItem;
	}
	

	public void display() {
		for(int i=0;i<nItems;i++)
			itemArray[i].display();
		System.out.println("/");
	}
	
	public int insertItem(DataItem newItem) {
		long newKey = newItem.data;
		
		nItems++;
		for(int i=ORDER-2;i>=0;i--) {
			if(itemArray[i]==null)
				continue;
			else {
				if(newKey < itemArray[i].data) {//shift existing item to the right
					itemArray[i+1] = itemArray[i];
					
				}
				else {
						itemArray[i+1] = newItem; //insert new item
						return i+1;
				}
			}
		}//end for
		//node was empty
		itemArray[0] = newItem;
		return 0;
	}
	
	
	
}
