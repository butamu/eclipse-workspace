class Anagram{
	private char[] array, tempArray;
	private char[][] anagramsArray;
	private int strLen;
	private int numPermutations;
	private char temp;
	
	public Anagram() {
		
	}
	
	public void rotate1(int position) {
		if(position == 1)
			System.out.print(array[position]);
		else {
				System.out.println(array[position] + ""+array[position-1]);
				System.out.print(array[position-1] + ""+array[position]);
				rotate1(position-1);
		}
	}
	
	private void rotate(int start) {
		
		tempArray = array;
		temp = tempArray[start];
		
		for(int i=start;i<strLen-1;i++)
			tempArray[i] = tempArray[i+1]; //shift characters one step right except the first one
		tempArray[strLen-1]=temp;
	}
	
	public int fact(int n) {
		if(n<=1)
			return 1;
		else
			return n * fact(n-1);
	}
	
	public void doAnagram(String str) {
		strLen = str.length();
		array = new char[strLen];
		tempArray = array;
		
		numPermutations = fact(strLen);
		anagramsArray = new char[numPermutations][strLen];
		int start=0;
		
		
		for(int i=0;i<strLen;i++) //insert the characters into the array
			array[i] = str.charAt(i);	
		
		for(int i = 0;i<numPermutations;i++) {
			for(int j=0;j<strLen;j++) {				
				anagramsArray[i][j]=tempArray[j];			
			}
			rotate(i%strLen);
			
			System.out.println("i%perm = " + i%strLen);
//			if(i==strLen-1)
//				start++;
			
		}
	}
	
	public void display() {
			
			for(int i=0;i<numPermutations;i++) {
				for(int j=0;j<strLen;j++) 
					System.out.print(anagramsArray[i][j]);
				
			System.out.println(" ");
			}
	}
}

public class Main {

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		
		anagram.doAnagram("omar");
		anagram.display();
		System.out.println("New rotate");
		anagram.rotate1(3);
		//System.out.println("Factorial of " + n + " = " + anagram.fact(n));
		
		//anagram.display();


	}

}
