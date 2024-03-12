package CollectonDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// Declare Linked List
		
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add("Welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		System.out.println(l.size()); //6
		
		//remove
	//	l.remove('A'); // exception ---index bound
		l.remove(3);
		System.out.println("After removing, new list: "+l);
		
		l.add(3, 'A');
		System.out.println("After Inserting "+l);
		
		// retrieving value/ object
		System.out.println(l.get(3));
		
		//change the value
		l.set(5, "X");
//		System.out.println("After Changing "+l);
//		
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}

		//Reading elements from LL using For..each loop
		
//		for(Object e:l)
//		{
//			System.out.println(e);
//		}
		
		//Reading elements from LL using  iterator() method
		
		Iterator it =l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
  