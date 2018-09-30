
public class Main {

	public static void main(String[] args) {
		int size = 20, pvt = 19;
		Array myArray = new Array(size);
		myArray.populate();
		myArray.display();
		
		int partIndex = myArray.partition(0, size-1, pvt);
		
		System.out.println("Pivot = " + pvt + " Partition index = " + partIndex);
		myArray.display();
		
		

	}

}
