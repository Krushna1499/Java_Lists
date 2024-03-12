package CollectonDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup =new ArrayList();
		
		// if we have to add multiple data
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		// if I want to remove all elements in arrayList
		al_dup.removeAll(al);
		System.out.println("After removing "+al_dup);
		
		// Collections 
		System.out.println("Elements in the array"+al);
		
		// sort the arrayList
		Collections.sort(al);
		System.out.println("Elemnts in the array after sorting"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println("Elements in the array after sorting and reverse "+al);
		
		//shuffling 
		Collections.shuffle(al);
		System.out.println("Elements in the array after shuffling "+al);

	}

}
