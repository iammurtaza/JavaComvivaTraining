package com.comviva.day3;

import java.util.HashSet;

import com.comviva.day4.Employee;

public class SetEx01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Harry");
		set.add("Sura");
		set.add("Potter");
		set.add("Harry");
		set.add("Sura");
		set.add("Potter");
		set.remove("Sura");
		
		System.out.println(set);
		
		for(String temp: set){
			System.out.println(temp);
		}
		
		set.forEach(System.out :: println);
	}
}
