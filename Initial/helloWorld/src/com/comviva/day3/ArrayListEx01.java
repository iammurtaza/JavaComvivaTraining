package com.comviva.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(true);
		list.add(43);
		list.add(2.1);
		list.add(new Object());
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
