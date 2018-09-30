class Triangle{
	int  nTh, sum;
	
	public Triangle() {

		sum = 0;
	}
	
	public int getTerm(int cols) {
		sum = cols;
		if(cols == 1)
			return 1;
		else
			return sum + getTerm(cols - 1);

	}
}

public class MainApp {

	public static void main(String[] args) {
	int columns = 1000;
	 Triangle triangle = new Triangle();
	 
	 System.out.println("For " + columns + " columns, sum = " +triangle.getTerm(columns));
	 

	}

}
