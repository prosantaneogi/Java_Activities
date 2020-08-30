package javaActivity3;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {

     HashSet<String> hs = new HashSet<>();
     hs.add("Prosanta");
     hs.add("IBM");
     hs.add("Elina");
     hs.add("Chandra");
     hs.add("Mathena");
     hs.add("Snigdha");
     
     
     System.out.println("The size of the HashSet using the size() method : " + hs.size());
     
     System.out.println("Remove an element using the remove() method : " + hs.remove("Mathena") );
     System.out.println("remove an element that is not present in the Set : " + hs.remove("Test"));
    
     
     System.out.println("Use the contains() method to check if an item is in the Set or not : " + hs.contains("IBM"));
     System.out.println(hs);
     
     
     
	}

}
