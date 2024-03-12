package CollectonDemo;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("Dog");
		l.add("cat");
		l.add("Dog");
		l.add("Ox");
		l.add("Horse");
		l.add("Camel");
		
		System.out.println(l);
		
		// how to add
		l.addFirst("Tiger");
		l.addLast("Elephant");
		
		
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//how to remove 
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first & last elements: "+l);;

	}

}
 