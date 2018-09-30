class Stack{
	private int[] array;
	int top;
	int max_size;
		
	public Stack(int size){
		max_size = size;
		array = new int[max_size]; //constructor
		top = -1;		
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	private boolean isFull() {
		return (top==(max_size-1));
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return -1;
		}
		else
//			System.out.println("Popped " + array[top]);
			return array[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return -1;
		}
		else
			return array[top];
	}
	
	public void push(int value) {
		if(isFull())
			System.out.println(value + " <- Stack is full! ");
		else {
			array[++top] = value;
//			System.out.println("Pushed <- "+ value);
		}
	}
	
}
