class Link{
	private int data;
	public Link next;
	
	Link(int d){
		data = d;
	}
	
	public int getData() {
		return data;
	}	
}

public class OrderdLinkedList {
	Link head,newLink,previous,current;
	
	public OrderdLinkedList() {
		
	}

	public void insert(int value) {
		newLink = new Link(value);
		current = head;
		previous = null;
		
		while(current != null && current.getData()<value) { //value larger than current
		
			//System.out.println("Current = " + current.getData() + " Value = " + value + " prev =" + previous);
			previous = current;					
			current = current.next;
		}
				
		if(previous == null) 
			head = newLink;			
		else 
			previous.next = newLink;
		
		newLink.next = current;	
				
	}	
	
	public void display() {
		current = head;
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.next;
		}
		System.out.println(" ");
	}
	

}
