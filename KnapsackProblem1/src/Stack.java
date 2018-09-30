class Stack{
	private long[] array;
	int top;
	int max_size;
		
	public Stack(int size){
		max_size = size;
		array = new long[max_size]; //constructor
		top = -1;		
	}
	
	private boolean isEmpty() {
		return (top<0);
	}
	
	private boolean isFull() {
		return (top==(max_size-1));
	}
	public void pop() {
		if(isEmpty())
			System.out.println("Stack is empty!");
		else
			System.out.print(" " + array[top--]);
	}
	
	public void push(long value) {
		if(isFull())
			System.out.println(value + " <- Stack is full! ");
		else {
			array[++top] = value;
			System.out.println("Pushed <- "+ value);
		}
	}
	public void display() {
		while(top>-1)
			pop();
	}
	public void resest() {
		top=-1;
	}
}