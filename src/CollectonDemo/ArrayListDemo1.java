package CollectonDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	
		//Declare Arraylist
		
	// ArrayList<Integer> al =new ArrayList<Integer>(); --only integer type of ArrayList 
	//	ArrayList<String> al =new ArrayList<String>(); -- only String type of ArrayList
		
		ArrayList al = new ArrayList();   //we can add any type of data --heterogenoues 
		
		al.add(100);
		al.add("Welcome");
		al.add('A');
		al.add(15.5);
		al.add(true);
		
		System.out.println(al);
		
 		// size()
		System.out.println("Number of elements in arraylist: "+al.size());	
		
		// remove();
		System.out.println(al.remove(1)); //or sysout(al.remove("welcome")) we can also write like this 
		System.out.println("After removing "+al);
		al.add(2,"Python");
		System.out.println("After Insertion "+al);
		
		// retrieve specific value
		System.out.println(al.get(2));
		
		// change or replace
		System.out.println(al.set(2, "C#"));
		
		System.out.println(al);
		
		// search contains() -- return true or false
		System.out.println(al.contains("C#")); //true
		
		System.out.println(al.contains("C")); //false
		// is empty or not
		System.out.println(al.isEmpty()); //false
		
	// how to read elements in array by using for loop 
	//	1) For loop
		
	/* System.out.println("After using for loop............");
	for(int i=0;i<=al.size();i++)
	{
		System.out.println(al.get(i));
	}*/
		
	//2) for each
		/* System.out.println("After using for each loop............");
		for(Object e: al)
		{
			System.out.println(e);
		} */
		
		//3) iterator
		
		System.out.println("After using iterator.........");
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
  		
	}

}
