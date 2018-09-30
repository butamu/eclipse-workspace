

class PriorityQueue{
	public int nElements;
	private long[] array;
	public int maxSize;
	
	public PriorityQueue(int s){ //constructor
		nElements = 0;
		maxSize = s;
		array = new long[s];
	}
	
	public boolean isEmpty() {
		return (nElements==-1);
	}
	
	public boolean isFull() {
		return (nElements==maxSize-1);
	}
	
	public long remove() {
		return array[--nElements];
	}
	
	public void display() {
		for(int i=0;i<maxSize;i++)
			System.out.println(array[i]);
	}
	
	
	public void insert(long value) {
		
		
		int i;
			if(nElements == 0)
				array[nElements++] = value;
			else { 
				for(i=nElements-1; i>=0;i--) {
					if(value > array[i]) {
						array[i+1] = array[i];						
					}
					else
						break;
				}
					array[i+1] = value; 
					nElements++;
				
			}
		
	}
}

public class PriorityQueueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		PriorityQueue pQueue = new PriorityQueue(size);
		long l = 0;
		
		

			pQueue.insert(40);
			pQueue.insert(52);
			//l = pQueue.remove();
			pQueue.insert(80);
			pQueue.insert(96);
			pQueue.insert(74);
			pQueue.insert(34);
			//pQueue.insert(78);
	
//		pQueue.display();
		
			int elements = pQueue.nElements;
		for(int i=0;i<elements;i++) {
			
			if(!pQueue.isEmpty()) {
				l = pQueue.remove();
				System.out.print(l+ " ");
			}
		}

	}

}
