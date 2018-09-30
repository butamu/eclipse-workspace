


public class Main {	
	
	public static void main(String[] args) {
		int a,b;
		a=3;
		b=3;
		
		System.out.println(a + "^" + b + " = " + power(a,b));
	}

	
	private static long power(int x, int y) {
		long answer;
		if(y==1) {
			System.out.println("Returning "+ x + "^" + y);		
			return x;
		}
		else {
				if(y%2==0) //if y is odd add an extra multiplication
					answer = power(x*x,y/2);
				else
					answer = x*power(x*x,y/2);
				
				System.out.println("Returning "+ x + "^" + y);
				return answer;
		}
		
	}
}

