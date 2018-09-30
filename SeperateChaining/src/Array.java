
public class Array {
	int index;
	int size;
	Chain[] chainArray;
	
	public Array(int s) {
		size = s;
		chainArray = new Chain[size];
		for(int i=0;i<size;i++)
			chainArray[i] = new Chain();
	}
	
	public int hash(int value) {
		return value%size;
	}
	
	public void insert(int value) {
		index = hash(value);
		chainArray[index].insert(value);
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(i + ": ");
			chainArray[i].show();
			System.out.println("");
		}
	}
	
	public void search(int value) {
		int index = hash(value);
		if(chainArray[index].find(value) == true)
			System.out.println(value + " was found");
		else
			System.out.println(value + " was not found");
	}

}
