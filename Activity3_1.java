package javaActivity3;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Prosanta");
		myList.add("Elina");
		myList.add("Chandra");
		myList.add("Mathena");
		myList.add("Snigdha");

		System.out.println(myList);
		
		System.out.println("3rd name in the ArrayList :" + myList.get(2));
		System.out.println("if a name exists in the ArrayList :" + myList.contains("Test"));
		System.out.println("number of names in the ArrayList :" + myList.size());
		
		myList.remove("Snigdha");
		System.out.println("Remove a name from the list and print the size() of the list : "  + myList.size());;
	}

}
