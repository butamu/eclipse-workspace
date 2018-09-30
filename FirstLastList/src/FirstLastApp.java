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

class FirstLast{
	private Link first, last, current;
	public FirstLast() {
		first = null;
		last = null;
		current = null;
	}
	
	public void insertFirst(int value) {
		Link newLink = null;
		 newLink = new Link(value);
		 
		 if(first == null) { //list is empty
			 first = newLink;
			 last = newLink; //mark the last element in the list
		 }
		 else {
			 newLink.next = first;
			 first = newLink;
		 }

	}
	
	public void insertLast(int value) {
		 Link newLink = new Link(value);
		 if(first == null) { //list is empty
			 first = newLink;
			 last = newLink; //mark the last element in the list
		 } 
		 else {
			 last.next = newLink;
			 last = newLink; // update the mark of last item
		 }
		 
	}
	
	public int remove() {		
		
		if(first == null) {
			last = null;
			return -1;
		}
		else {
				int temp = first.getData();
				first = first.next;
				return temp;				
		}
		
	}
	
	public void display() {
		current = first;
		while(current != null) {
			System.out.print(" " +current.getData());
			current = current.next;
		}
		System.out.println("");
	}
}

public class FirstLastApp {

	public static void main(String[] args) {
		FirstLast fl = new FirstLast();
		fl.insertFirst(45);
//		fl.insertFirst(63);
		fl.insertLast(78);
//		fl.insertFirst(33);
		fl.insertFirst(65);
//		fl.insertLast(77);
		
		fl.display();
		
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();
		System.out.println("Removed " +fl.remove());
		fl.display();

	}

}
