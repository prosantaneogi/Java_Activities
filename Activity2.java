package javaActivity2;

public class Activity2 {

	public static void main(String[] args) {

		int[] arr = {10 , 77 , 10 , 54 , -11 , 11 };
		int sum = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			
			if (arr[i] == 10) {
				sum = sum + arr[i];
				
			}
			
		}
		if (sum == 30) {
			System.err.println("Sum of all the 10's is : " + sum );
		}
		else 
			System.err.println("Sum of all the 10's is : " + sum );
	
	}

}
