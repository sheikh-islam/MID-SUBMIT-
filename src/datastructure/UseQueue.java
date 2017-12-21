package datastructure;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<>();
		queue.add("NY");
		queue.add("NJ");
		queue.add("WA");
		queue.add("FL");
		queue.add("KY");
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.element());

		//using iterator
		Iterator its= queue.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}
		queue.remove();
		System.out.println("after removing one element: ");
		for(String s:queue){
			System.out.println(s);
		}
	}

}
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
