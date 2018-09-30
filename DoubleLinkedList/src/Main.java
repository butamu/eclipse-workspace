
public class Main {

	public static void main(String[] args) {
		List myList = new List();
		
		myList.insertFirst(56);
		myList.insertRight(75);
		myList.insertRight(45);
		myList.insertRight(96);
		myList.insertFirst(90);
		myList.insertRight(78);
		myList.insertRight(71);
		myList.insertFirst(10);
		
		System.out.println("Displaying from left to right: ");
		myList.displayLeft();
		
		System.out.println("Displaying from right to left: ");
		myList.displayRight();


	}

}
