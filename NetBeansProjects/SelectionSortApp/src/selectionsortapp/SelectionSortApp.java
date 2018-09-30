/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open 
 * the template in the editor.
 */
package selectionsortapp;


class Array{
    private long a[];
    private int max_size; //array size
    private int elements; //number of elements
    private int nComparisons = 0;
    
    public Array(int max){ //constructor
       max_size=max;
       a = new long[max_size];
        elements = 0;
    }
    
    private int getSmallest(int start, int end) {
    	int smallest = start;
    	for(int i=start;i<end;i++) {
    		if(a[i] < a[smallest])
    			smallest = i;
    		nComparisons++;
    	}
    	return smallest;
    }
    
    private void swap(int x, int y) {
    	long temp;
    	temp = a[x];
    	a[x] = a[y];
    	a[y] = temp;
    }
    
    public void sort() {
    	for(int i=0;i<elements-1;i++) {
    		int smallest = getSmallest(i+1,elements);    		
    			swap(i,smallest);    			
    		
    	}
    	System.out.println("Comparisons = " +  nComparisons);
    }
    
    public void display(){
        for(int i=0;i<elements;i++)
           System.out.print(a[i] + " ");
        System.out.println("");
    }
    
    public int getElements() {
    	return elements;
    }
    
  
    public void add(long n){
        if(elements < max_size){
            a[elements]=n;            
            System.out.println(n + " was added... Elements = "+ elements);
            elements++;
        }
        else
            System.out.println("Sorry, " + n + " was not added array is full... Max = "+ max_size );
    }
    
}

public class SelectionSortApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Array myArray = new Array(20);
       myArray.add(13);
        myArray.add(45);
        myArray.add(10);
        myArray.add(60);
        myArray.add(45);
        myArray.add(10);
        myArray.add(6);
        myArray.add(67);
        myArray.add(-1);
        myArray.add(3);
        System.out.println("No. of elements = " + myArray.getElements());
        myArray.display();
        myArray.sort();
        myArray.display();

    }
    
}
