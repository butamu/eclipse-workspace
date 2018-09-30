
public class Main {

	public static void main(String[] args) {
		Array myArray = new Array(10);
		int interval;
		interval = 4;
		myArray.populate();
//		myArray.add(7);
//		myArray.add(10);
//		myArray.add(1);
//		myArray.add(9);
//		myArray.add(2);
//		myArray.add(5);
//		myArray.add(8);
//		myArray.add(6);
//		myArray.add(4);
//		myArray.add(3);
		
		System.out.println("Before sorting..");
		myArray.display();
		
		myArray.insertionSort(interval);
		System.out.println("After complete sorting..");
		myArray.display();

	}

}
