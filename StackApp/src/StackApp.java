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
			System.out.println("popped -> " + array[top--]);
	}
	
	public void push(long value) {
		if(isFull())
			System.out.println(value + " <- Stack is full! ");
		else {
			array[++top] = value;
			System.out.println("Pushed <- "+ value);
		}
	}
	
}

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack myStack = new Stack(3);
		
		myStack.push(34);
		myStack.push(56);
		myStack.push(43);
		myStack.push(12);
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();		
	}

}
