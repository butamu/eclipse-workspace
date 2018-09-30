
public class Main {

	public static void main(String[] args) {
		long[] items = {2,0,9,3,6,12,8,1};
		int target = 9;
		
		solve(items,target);

	}
	
	private static void solve(long[] array,int t) {
		int current, target = t,selector=0,size;
		long sum;
		current = 0;
		size = array.length;
		Stack myStack = new Stack(size); 
		boolean found = false;
		
		while(current < size-2) {		
			myStack.resest(); //empty the stack
			System.out.print("Initially picked " + array[current]);
			selector = current+1;			
			sum = array[current];
			myStack.push(array[current]); //store the current digit
			if(sum==target) {
				found = true;
				break;
			}
			while(selector<size) {
				sum = sum + array[selector];
				myStack.push(array[selector]); //store the current digit
				System.out.println(" Added " + array[selector] + " Sum = " + sum);
				if(sum>target) {
					System.out.println(sum + " is too big");
					sum = sum - array[selector];
					myStack.pop(); //remove digit
					System.out.println("Removed " + array[selector] + " sum = " + sum);
					selector++;
				}
				else if(sum<target) {
					System.out.println(sum + " is too small");					
					selector++;
				}
				else {
					System.out.println(sum + " equals to target");
					found = true;
					break;
				}	

			}
			if(found)
				break;
			current++;
		}
		if(found) {
			System.out.println(" Problem solved!");
			myStack.display();
		}
		else
			System.out.println(" Problem not solved!");
	}

}
