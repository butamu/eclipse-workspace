
public class Main {

	public static void main(String[] args) {
		int arraySize = 37;
		Array array  = new Array(arraySize);
		
		for(int i=0;i<arraySize;i++) {
			int value = (int)(Math.random()*50-1);			
			array.insert(value);
		}
		
		array.insert(45);
		array.search(46);
		
		array.display();

		
	}

}
