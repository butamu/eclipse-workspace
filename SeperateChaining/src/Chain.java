
public class Chain {
	Link head;
	
	public Chain() {
		head = null;		
	}
	
	public void insert(int d) {//insert in ascending order
		
		Link newLink = new Link(d);
		Link current = head;
		Link prev = head;
		
		
		if(head == null) { //chain is empty
			head = newLink;
			return;
		}
		else {
			while(current != null && newLink.data > current.data) {
					prev = current;
					current = current.next;					
			}
		}
				
		if(prev == current) { //if link in the chain
			newLink.next = head;
			head = newLink;
			return;
		}
			
		prev.next = newLink;
		newLink.next = current;				
								
					
	}
	
	public void show() {
		Link current = head;
		while(current != null) {
			current.display();
			current = current.next;
		}
	}
	
	public boolean find(int value) {
		Link current = head;
		while(current != null && current.data <= value) {
			if(current.data == value)
				return true;
			else
				current = current.next;
		}
		return false;
			
	}
	

}
