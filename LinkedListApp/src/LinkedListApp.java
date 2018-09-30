class Link{
	private int data;
	public Link next;
	
	public Link(int d) {
		data = d;
	}
	public int display() {
		 return data;
	}
}

class List{
	private Link head, current, newLink, temp;	
	private int nElements;
	
	public List() {
	//	head.next = null;
//		current.next = null;
		nElements = 0;
	}
	
	public void addLink(int n) {		
			newLink = new Link(n);
			newLink.next = head;
			head = newLink;
			++nElements;
	}
	
	public int size() {
		return nElements;
	}
	
	public void show() {
		current = head;
		while(current != null) {
			
			System.out.print(current.display()+ " ");
			current = current.next;
		}
		
		System.out.println("");
	}
	
	public int find(int value) {
		current = head;
		int pos = -1;
		while(current.next != null) {
			pos++;
			if(current.display()==value)
				return nElements - pos;
			current = current.next;
		}
		return -1;
		
	}
	
	public boolean delete(int value) {
		Link prev = null, current;
		current = head;
		
		
		while(current != null) {
			if(current.display()==value) {
				if(current == head) { //first node at the head
					current = current.next;
					head = current;
				}
				else {
					current = current.next; //bypass the current node
					prev.next = current;
				}
				return true;
			}
			
			prev = current;
			current = current.next;
		}
		return false;		
	} //end delete
	
}

public class LinkedListApp {

	public static void main(String[] args) {
		List list = new List();
		
		list.addLink(56);
		list.addLink(45);
		list.addLink(12);
		list.addLink(78);
		list.addLink(96);

		System.out.print("Before delete => ");
		list.show();
		
		int value = 56;
		
		boolean del = list.delete(value);
		if(del)
			System.out.println(value + " was deleted");
		else
			System.out.println(value + " was not deleted");
		
		System.out.print("After delete => ");
		list.show();
	}

}
