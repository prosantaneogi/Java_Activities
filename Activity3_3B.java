package javaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {

		//Create a Deque named dq.
		
		Deque<String> dq = new LinkedList<>();
		
		//Add any 6 animals to it.
		
		dq.add("Lion");
		dq.offer("Tiger");
		dq.addFirst("Dog");
		dq.addLast("Cat");
		dq.offerFirst("Bee");
		dq.offerLast("Peacock");
		//Use the Iterator interface to iterate through the deque and print the values in the queue.
		System.out.println(" print the values in the queue :" + dq);
		Iterator<String> itr =  dq.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(" print the values in the queue :" + itr.next());
			System.out.println(" print the values in the queue :" + string );
		}
		
			
		//Peek() at the head element and the tail element of the queue.
		System.out.println("Peek() at the head element and the tail element of the queue : " + dq.peek());
		//Check if there is a Wolf present in the queue using the contains() method.
		System.out.println("Check if there is a Wolf present in the queue using the contains() method : " + dq.contains("Wolf"));
		//Remove() the first and last element from the queue.
		
		dq.removeFirst();
		dq.removeLast();
		
		//Print the size() of the queue after removal.
			System.out.println("Print the size() of the queue after removal : " + dq.size());
			System.out.println(" print the values in the queue :" + dq);
	}

}
