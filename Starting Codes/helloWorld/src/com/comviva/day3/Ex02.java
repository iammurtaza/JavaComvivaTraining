package com.comviva.day3;

import java.io.IOException;

public class Ex02 {
	public static void checkName(String name) throws NameTooSmallException {
		if (name.length() < 5) {
			throw new NameTooSmallException(
					"Sorry, name can't be less than 5 character");
		}
	}

	public static void checkIncomeTax(int salary, int taxAmount, String name)
			throws IOException, NameTooSmallException {
		try {
			checkName(name);
			if (salary < 10000) {
				throw new RuntimeException("No tax for you " + name);
			} else {
				if (taxAmount >= 10000 && taxAmount < 20000) {
					throw new IOException("Good to go " + name
							+ ", better to have an accountant");
				} else {
					System.out.println("Pay using official site " + name);
				}
			}
		} catch (RuntimeException re) {
			throw new RuntimeException("Something went wrong form caller ", re);
		}
	}

	public static void main(String[] args) {
		try {
			checkIncomeTax(1000, 200, "Jen");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RuntimeException re) {
			re.printStackTrace();
		} catch (NameTooSmallException ntse){
			System.out.println(ntse);
		}
		System.out.println("-------------exiting---------------");
	}
}
