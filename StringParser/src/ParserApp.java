import java.io.*;

class Stack{
	private char[] array;
	int top;
	int max_size;
		
	public Stack(int size){
		max_size = size;
		array = new char[max_size]; //constructor
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
			System.out.println("\nStack is empty!");
		else
			System.out.print(" "+array[top--]);
	}
	
	public void push(char value) {
		if(isFull())
			System.out.println(value + " <- Stack is full! ");
		else {
			array[++top] = value;			
		}
	}
	

}

class BracketChecker{
	private String input;
	private int stack_size;
	private Stack myStack;
	
	public BracketChecker(String in) {
		input = in;
		stack_size = input.length();
		myStack = new Stack(stack_size);
				
	}
	public void check() {
		
		char ch;
		
		 //create stack large enough to hold the string of characters
		
		for(int i=0;i<stack_size;i++) {//get characters one by one
			ch = input.charAt(i);
			myStack.push(ch);			
		}
		
	}
	
	public void display() {
		for(int j=0;j<stack_size;j++) {
			myStack.pop();
		}
		System.out.println("\nStack size = "+ stack_size);
	}
}
public  class ParserApp {
	

	public static void main(String[] args) throws IOException {
		
		String inputString;
		
		inputString = readString();
		BracketChecker bracketchecker = new BracketChecker(inputString);
		bracketchecker.check();
		bracketchecker.display();

	}
	
	public static String readString() throws IOException { //read a stream of characters from keyboard
		System.out.print("Enter a stream of characters: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	
		String s = br.readLine();
		return s;
	}
	
	

}
