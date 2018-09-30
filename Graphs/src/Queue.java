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
	
	public boolean isEmpty() {
		return (nElements==0);
	}
	
	private boolean isFull() {
		return (nElements==max_size);
	}
	public int remove() {
		if(isEmpty()) {
			System.out.println("\nQueue is empty!");
			return -1;
		}
		else {
				nElements--;				
				if(front == max_size)
					front = 0; //wrap around
				
				return array[front++];
		}
	}
	
	public void display() {
		for(int i=0;i<nElements;i++) {
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
			
			
		}
	}
	
	
}
