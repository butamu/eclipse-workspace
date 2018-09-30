
public class List {
	Link current, first, last, right, left, newLink;
	public List() {
		
	}

	public boolean isEmpty() {
		return (first == last);
	}
	
	public void insertRight(int value) {
		newLink = new Link(value);
		
		if(first == null) { //Beginning of the list
			first = newLink;
			current = first;
			last = current;
		}
		else {
			try {
					if(current == last) {
						//last link of the list
						current.next = newLink;
						newLink.previous = current;
						current = newLink;
						last = current;
					}
					else { //somewhere in the middle of list
						newLink.next = current.next;
						current.next.previous = newLink;
						newLink.previous = current;
						current.next = newLink;
						current = newLink;
					}				
				
			} catch (NullPointerException e) {			
				System.out.println("Error: Null pointer");
			}
			
		}
	}
	
	public void insertFirst(int value) {
		newLink = new Link(value);
		if(first == null) {
			first = newLink;
			last = first;
			current = first;
		}
		else {
			current = newLink;
			current.next = first;
			first = newLink;
			first.next.previous = current;
		}
				
	}
	
	public void displayRight() {
		current = first;
		
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.next;
		}
		
		System.out.println("");
	}

	public void displayLeft() {
		current = last;
		
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.previous;
		}
		
		System.out.println("");
	}
	
}
