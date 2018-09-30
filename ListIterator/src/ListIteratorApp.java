class Link{
	private int data;
	public Link next;
	
	public Link(int d) {
		data = d;
	}
	public int getData() {
		 return data;
	}
}
/////////////////////////////////////////////////////////end of Link class

class List{
	private Link head, current, newLink, temp;	
	private int nElements;
	
	public List() {
		nElements = 0;
		head = null;		
	}
	
	public Iterator getIterator() {
		Iterator listIterator = new Iterator(this);
		return listIterator;
	}
	
	public Link getFirst() {
		return head;
	}
	
	public void setFirst(Link newLink) {		
		head = newLink;
	}
	

	public boolean isEmpty() {
		return (head == null);
	}
	
	
	public void show() {
		current = head;
		while(current != null) {
			
			System.out.print(current.getData()+ " ");
			current = current.next;
		}
		
		System.out.println("");
	}
	
	
}
//////////////////////////////////////// end of List class

class Iterator{
	private Link current;
	private Link previous;
	private List ourList;
	
	public Iterator(List list) { //constructor
		ourList =  list;
		reset();
	}
	
	public void reset() {
		current = ourList.getFirst(); //start from first link
		previous = null;		
	}
	
	public boolean atEnd() {
		return (current.next == null); // check if it is the last link in the list
	}
	
	public void nextLink() { //move to next link
		previous = current;
		current = current.next;
	}
	
	public Link getCurrent() {
		return current;
	}
	
	public void deleteCurrent() {
		if(previous != null) {
			
			previous.next = current.next;
			
			if(atEnd()) {
				reset();
				
			}
			else {
				current=current.next;
			}
		}
		else {
			ourList.setFirst(current.next);
			reset();
		}
		
	}
	
	public void insertAfter(int data) { //insert after current link
		Link newLink = new Link(data);
		if(ourList.isEmpty()) {
			ourList.setFirst(newLink);
			current = newLink;
		}
		else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink(); //point to the new link created
		}
		
		System.out.println("Prev = " + previous);
	}
	
	public void insertBefore(int data) { //insert before current link
		Link newLink = new Link(data);
		if(previous  == null) {
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}		
		else {
			newLink.next = current;
			previous.next = newLink;
			current = newLink;
		}
		System.out.println("Prev = " + previous);
	}	
	
} //end of Iterator class

public class ListIteratorApp {

	public static void main(String[] args) {
		
		List list = new List();				
	
		Iterator iterator = list.getIterator();
		
		iterator.insertBefore(96);
		iterator.insertAfter(74);
		iterator.insertAfter(40);
		iterator.insertBefore(23);
		
		iterator.insertBefore(56);
		int value = iterator.getCurrent().getData();
		System.out.println("Current iterator = " + value);
		list.show();
		
		
		iterator.deleteCurrent();
		System.out.println("After deleting " + value);
		
		value = iterator.getCurrent().getData();
		System.out.println("Current iterator = " + value);
		
		list.show();
	}

}
