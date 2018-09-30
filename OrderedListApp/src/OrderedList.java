//using an ordered linked list to sort an array

public class OrderedList {
	private int[] dataArray;
	private OrderdLinkedList newLink, current, previous;
	private int top, maxsize;
	
	public OrderedList(int size) {
		maxsize = size;
		dataArray = new int[maxsize];
		top = -1;
	}
	
	private boolean isFull() {
		return top==(maxsize-1);
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void insert(int value) {
		if(!isFull()) 
			dataArray[++top] = value;
		else
			System.out.println("List is full. ");
	}
	
	public void display() {
		for(int i=0;i<=top;i++) 
			System.out.println(dataArray[i] + " ");
		
		System.out.println("Top = " + top);
	}
}
