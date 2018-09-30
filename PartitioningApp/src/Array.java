public class Array {
	private int size;
	private int element;
	private long[] array;

	public Array(int s) {
		size = s;
		element = 0;
		array = new long[size];		
	}

	public void add(long value) {
		if(element<size) {
			array[element++] = value;
		}
		else
			System.out.println("\nArray full!");
	}
	
	public void display() {
		for(int i=0;i<element;i++)
			System.out.print(array[i] + " ");
		System.out.println("");
	}

	public void populate() {
		while(element<size) {
			array[element++] = (long)(Math.random()*50-1);
		}
	}
	
	private void swap(int x, int y) {
		long t = array[x];
		array[x] = array[y];
		array[y] = t;		
	}
	
	
	public int partition(int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right + 1;
		
		while(true) {
			while(leftPtr<right && array[++leftPtr]<pivot) {
				;
			}
			
			while(rightPtr>left && array[--rightPtr]>pivot) {
				;
			}
			
			if(leftPtr>=rightPtr) {
				break;
			}
			else {
				swap(leftPtr,rightPtr);
				System.out.println("Swapped " + array[rightPtr] + " and " + array[leftPtr]);
			}
						
		}
		return leftPtr;
	}
}
