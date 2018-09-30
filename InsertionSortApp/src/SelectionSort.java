
class Array{
    private long a[];
    private int max_size; //array size
    private int elements; //number of elements
    
    public Array(int max){ //constructor
       max_size=max;
       a = new long[max_size];       
        elements = 0;
    }
    
    public void sort() {
    	for(int i=0;i<elements;i++) {
    		long temp = a[i];
    		int mark = i;
    		while(mark>0 && temp<a[mark-1]) {
    			a[mark] = a[mark-1];
    			mark--;
    		}
    		a[mark] = temp;
    		
    	}
    	
    }
    
    public void display(){
        for(int i=0;i<elements;i++)
           System.out.print(a[i] + " ");
        System.out.println("");
    }
    
    public int getElements() {
    	return elements;
    }
    
  public void fillArray(int n) {
	  for(int i=0;i<n;i++) {
		  long random = (long)(Math.random()*50-1);
		  add(random);
	  }
  }
  
  public void noDups() {
	  int mark;
	  for(int i=0;i<elements;i++) {
		  if(a[i] == a[i+1]) { //duplicate detected
			  mark = i+1;
			  for(int j=mark;j<elements;j++)
				  a[j]=a[j+1];
			  elements--;
		  }
	  }
  }
  
    private void add(long n){
        if(elements < max_size){
            a[elements]=n;            
            elements++;
        }
        else
            System.out.println("Sorry, " + n + " was not added array is full... Max = "+ max_size );
    }
    
}


public class SelectionSort {

	public static void main(String[] args) {

		Array myArray = new Array(20); //create new array that can hold less or up to 20 elements
	       myArray.fillArray(12); //populate the array with specified number of random elements
	        System.out.println("No. of elements = " + myArray.getElements());
	        myArray.display();
	        myArray.sort(); //use selection sort
	        myArray.display();		
	        myArray.noDups(); //remove duplicate elements
	        myArray.display();

	}

}
