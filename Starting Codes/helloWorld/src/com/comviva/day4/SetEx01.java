package com.comviva.day4;

import java.util.HashSet;

import com.comviva.day4.Employee;

public class SetEx01 {
	public static void main(String[] args) {	
		HashSet<Employee> set2 = new HashSet<>();
		set2.add(new Employee(12,"Hello",2222220312.1));
		set2.add(new Employee(121,"Hasdasello",11120312.1));
		set2.add(new Employee(1222,"Helasdasdlo",203111112.1));
		set2.add(new Employee(12333,"Helasdasdlo",20312222.1));
		set2.add(new Employee(124444,"Heasdasdasdasdasdllo",233330312.1));
	}
}
