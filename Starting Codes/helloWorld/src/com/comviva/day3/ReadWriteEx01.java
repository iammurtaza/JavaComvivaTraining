package com.comviva.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteEx01 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int flag=1;
		int empId=0;
		while(flag==1){
			System.out.println("Enter your emp ID: ");
			try{
				flag=0;
				empId = Integer.parseInt(br.readLine());
			} catch(NumberFormatException nfe) {
				flag=1;
			}
		}
		System.out.println("Enter your name: ");
		String empName = br.readLine();
		
		System.out.println("Enter your salary: ");
		double empSal = Double.parseDouble(br.readLine());
		
//		System.out.println(empId);
//		System.out.println(empName);
//		System.out.println(empSal);
		
		File file = new File("sample.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("EmpId: "+ empId);
		bw.newLine();
		bw.write("EmpName: " + empName);
		bw.newLine();
		bw.write("EmpSal: " + empSal);
		bw.newLine();
		bw.write("-------------------------");
		bw.newLine();
		bw.close();
		System.out.println("Data saved in the file");
		System.out.println("");
		BufferedReader br1 = new BufferedReader(new FileReader("sample.txt"));
		String line;

		while((line = br1.readLine()) != null) {
			System.out.println(line);
		}
		br1.close();
	}
}
