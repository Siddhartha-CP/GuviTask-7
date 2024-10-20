package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Siddu");
		names.add("Harish");
		names.add("kantha");
		names.add("harsha");
		
		System.out.println("Direct Print");
		
		System.out.println(names);
		
		System.out.println("Using for each: ");
		
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("Using for loop");
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String> itr=names.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//access the element
		
		System.out.println("Get and set method");
		
		System.out.println("before :" + names.get(3));
		
		names.set(3, "Subba");
		
		System.out.println("After: " + names.get(3));
		
		System.out.println(names);
		
		//sorting
		
		System.out.println("Sorting");
		
		System.out.println("Before sorting: " +names);
		
		Collections.sort(names);
		
		System.out.println("After sorting: " +names);
		
	}

}
