package com.comviva.day2;

public class StaticEx1 {
	static int x=34;
	public static int add(int num1,int num2){
		System.out.println(x);
		return num1+num2;
	}
	static{
		x=1111;
		System.out.println(x);
		System.out.println("I AM THE STATIC BLOCK");
	}
	static{
		System.out.println("I AM THE 2nd STATIC BLOCK");
	}
	public static void main(String[] args) {
		x=10201;
		System.out.println(x);
		System.out.println("RESULT IS: "+add(27,33));
	}
}
