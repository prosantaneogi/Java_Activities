package javaActivity3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(11);
		q.add(111);
		q.add(1111);
		q.add(11111);
		
		
		System.out.println(q);
		
		System.out.println("Remove a number in the Queue using the remove() method. : " +q.remove(111));
		
		System.out.println("Peek() at the first number in the Queue after removal : " +q.peek());
		System.out.println("Print the size of the Queue using the size() method : " +q.size());
		System.out.println("Print the updated Queue : " +q );
		
	}

}
