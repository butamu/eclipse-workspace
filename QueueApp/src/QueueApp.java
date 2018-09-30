class Queue{
	private int[] array;
	int front, rear, nElements;
	int max_size;
		
	public Queue(int size){
		max_size = size;
		array = new int[max_size]; //constructor
		front = 0;
		rear = -1;
		nElements = 0;
	}
	
	private boolean isEmpty() {
		return (nElements==0);
	}
	
	private boolean isFull() {
		return (nElements==max_size);
	}
	public void remove() {
		if(isEmpty())
			System.out.println("\nQueue is empty!");
		else {
				nElements--;
				System.out.print("\nRemoved " + array[front++] + ", rear = " + rear);
				if(front == max_size)
					front = 0; //wrap around
				System.out.println(", front = " + front + ", elements = " + nElements);
		}
	}
	
	public void display() {
		for(int i=0;i<max_size;i++) {
			System.out.println(" " + array[i]);
		}
	}
	
	public void insert(int value) {
		if(isFull())
			System.out.println("\n" + value + " <- Queue is full! ");
		else {
	
			if(rear == max_size-1)
				rear = -1;
			nElements++;
			array[++rear] = value;			
			System.out.println("\nInserted " + value + ", rear = " + rear + ", font = " + front + ", elements = " + nElements);
			
		}
	}
	
	
}

public class QueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue myQueue = new Queue(5);
		
		
		myQueue.insert(78);
		myQueue.insert(15);
		myQueue.remove();
		myQueue.insert(36);
		myQueue.remove();
		myQueue.insert(41);
		myQueue.insert(84);
		myQueue.remove();
		myQueue.insert(10);
		myQueue.insert(60);
		myQueue.insert(45);
		myQueue.insert(95);
//		myQueue.remove();
		
		System.out.println("Elements = " + myQueue.nElements);
		int queueSize = myQueue.nElements;
		
		for(int i=0;i<=queueSize;i++) {
			myQueue.remove();
		}
		
		myQueue.display();
	}

}
