package com.comviva.day3;

public class Exception01 {
	public static void main(String[] args) {
		int res;
		int num1 = 10;
		int num2 = 0;
		try {
			try {
				int arr[] = new int[-4];
				arr[10] = 78;
			} catch (NegativeArraySizeException nase) {
				System.out.println("neg array size");

			} catch (ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("array index out of bounds");
			}
			res = num1 / num2;
			System.out.println("Result is " + res);
		} catch (ArithmeticException ae) {
			System.out.println("div by 0");
		} catch (Exception e) {
			System.out.println("something went wrong with error message" + e);
		} finally {
			System.out.println("I EXECUTE AT ANY COST");
		}
		System.out.println("....stuff....");
	}
}
