package com.comviva.day3;

import java.util.Vector;

public class ListEx03 {
	public static void main(String[] args) {
		Vector<String> list = new Vector<>(2,11);
		System.out.println(list.size());
		System.out.println(list.capacity());
		
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		list.add("dasdasdasd");
		
		System.out.println(list.size());
		System.out.println(list.capacity());
	}
}
