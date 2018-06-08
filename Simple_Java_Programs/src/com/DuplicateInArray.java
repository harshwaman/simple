package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		Iterator<Integer> itr = ll.descendingIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}
}
