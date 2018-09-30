
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
	
	public void insertSort() {
		int current = 1,selector=1;
		long temp;
		while(current<size) {
			temp = array[current];
			selector = current;

			while(selector>0 && temp<array[selector-1]) {
						array[selector] = array[selector-1]; //shift items to the right					
						selector--;
			}
		
			array[selector] = temp;
			current++;
			
		}
	}
}
