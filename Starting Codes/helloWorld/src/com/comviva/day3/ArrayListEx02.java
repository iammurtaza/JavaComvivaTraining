package com.comviva.day3;

import java.util.ArrayList;

public class ArrayListEx02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("jerry");
		list.add("show");
		//Iterator<String> itr = list.iterator();
		
		System.out.println(list.size());
		for(String temp : list) {
			System.out.println(temp);
		}
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		ArrayList<? extends Number> listNumber = new ArrayList<>();
		list.add(23, null);
		
	}
}
