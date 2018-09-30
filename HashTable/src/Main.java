
public class Main {

	public static void main(String[] args) {
		int arraySize = 13;
		HashTable table = new HashTable(arraySize);
		
		for(int i=0;i<arraySize/2;i++) {
			int value = (int)(Math.random()*50-1);			
			table.insert(value);
		}
		
		table.display();

	}

}
