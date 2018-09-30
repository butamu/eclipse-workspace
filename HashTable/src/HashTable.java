
public class HashTable {
	private int[] array;
	int nElements;
	int size;
	int nonItem = -1;
	
	public HashTable(int s) {
		size = s;
		array = new int[size];
		for(int i=0;i<size;i++)
			array[i] =  nonItem; //initialize all elements to non item
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			if(array[i] != nonItem)
				System.out.print(i+":"+array[i] + " ");
			else
				System.out.print(i+":**  ");
		}
	}
	
	private int hash(int value) {		
		return (value%size);
	}
	
	public void insert(int value) {
		int index = hash(value);
//		System.out.println("index = " + index);
		if(array[index] != nonItem)
			System.out.println(value + " could not be inserted. Collision at " + index);
		else
			array[index] = value;
		
	}

}
