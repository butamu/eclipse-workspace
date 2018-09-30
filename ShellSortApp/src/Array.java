
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
	
	
	public void insertionSort(int invl) {
			
		
	while (invl>0) { //reducing interval gaps by one 
		int temp, next,count=0;	
		while (count < size) {
			temp = count;
			next = temp + invl;
			while (next < size) {
				if (array[temp] > array[next]) {
					swap(temp, next);
				} else
					temp = next;
				next = next + invl;

			}
			System.out.print("After almost sorting.. ");display();
			++count;
		} 
		invl--;
	}
	}
}
