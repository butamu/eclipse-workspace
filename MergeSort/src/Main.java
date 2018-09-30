// this app is incomplete

public class Main {

	public static void main(String[] args) {
		
		int[] array1 = {23,45,78,80,85,89};
		int[] array2 = {22,34,56,78,90,93};
		
				
		int size1 = array1.length;
		int size2 = array2.length;
		
		int[] array3 = new int[size1+size2];
		
		mergeSort(array1,array2,array3);
		
		display(array3);
	}

	public static void mergeSort(int[] arr1, int[] arr2, int[] arr3) {
		int pos1, pos2, pos3;
		pos1 = pos2 = pos3 =0;
		
		for(int i=0;i<arr3.length;i++) {
			while(pos1<arr1.length ) {
				if(arr1[pos1]<arr2[pos2])
					arr3[pos3++] = arr1[pos1++];
				
			else 
				arr3[pos3++] = arr2[pos2++];
				
			}
		}
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i] + " ");
		
	}
	
}
