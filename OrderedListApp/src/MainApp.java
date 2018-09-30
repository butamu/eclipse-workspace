
public class MainApp {

	public static void main(String[] args) {
		//OrderedList od = new OrderedList(5);
		
		OrderdLinkedList od = new OrderdLinkedList(); 
		
		od.insert(41);
		od.insert(74);
		od.insert(69);
		od.insert(23);
		od.insert(70);
		od.insert(98);
		od.insert(11);
		od.insert(78);
		od.insert(-7);
		
		
//		od.insert(90);
		
		od.display();
	}

}
