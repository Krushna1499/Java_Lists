package CollectonDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l =new LinkedList(); 
		
		new_l.addAll(l);
		
		System.out.println(new_l);
		
		new_l.removeAll(l);
		System.out.println(new_l);
		
		//sort() Collections.sort(collection)
		
		System.out.println("Before Sorting: "+l);
		Collections.sort(l);
		System.out.println("After Sorting: "+l);
		
		//reverse order
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order:"+l);
		
		//shuffling 
		Collections.shuffle(l);
		System.out.println("After Shuffling: "+l);  
 
	}

}
