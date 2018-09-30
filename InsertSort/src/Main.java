public class Main {

	public static void main(String[] args) {
		Array myArray = new Array(20);
		myArray.populate();
		
		System.out.println("Before sorting..");
		myArray.display();
		
		myArray.insertSort();
		System.out.println("After sorting..");
		myArray.display();

	}

}
