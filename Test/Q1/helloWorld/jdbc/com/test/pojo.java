package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pojo{
	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(
				new FileReader("file.txt"));
		String line;

		while ((line = br1.readLine()) != null) {
			String arr[] = line.split(" ");
	
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			//for finance
			if(arr[2].equals("finance")){
				finance f1 = new finance(Integer.parseInt(arr[0]),arr[1],arr[2]);
				f1.start();
			}
			//for accounts
			else{
				account a1 = new account(Integer.parseInt(arr[0]),arr[1],arr[2]);
				a1.start();
			}
			
			System.out.println("----------------");
		}
		br1.close();

	}
}
