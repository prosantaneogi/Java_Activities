package javaActivity3;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,1,7,5,6,10,0};
		sort(arr);
		System.out.println("The sorted array :" + Arrays.toString(arr));

	}

	private static void sort(int[] arr) {
		
		int arrlenth = arr.length;
		
		for (int i = 0; i < arrlenth; i++) {
			int val = arr[i];
			int j = i-1;
			
				while (j >= 0 && val < arr[j]) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j+1]= val;
				
			}
			
		}
		
	}


