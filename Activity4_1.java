package javaActivity4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        Random indexGen = new Random();
	        
	        System.out.print("Enter integers value ");
	        System.out.println("(Endof non-integer to terminate): ");

	        while(scan.hasNextInt()) {
	            list.add(scan.nextInt());
	        }

	        Integer nums[] = list.toArray(new Integer[0]);
	        int index = indexGen.nextInt(nums.length);
	        System.out.println("Index value : " + index);
	        System.out.println("Value in arary at Index value: " + nums[index]);

	        scan.close();
	    }
	

}
