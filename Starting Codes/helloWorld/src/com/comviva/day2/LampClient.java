package com.comviva.day2;

public class LampClient {
	public static void main(String[] args) {
		Lamp[] l = new Lamp[3];
		
		l[0] = new Gurgoan();
		l[0].on();
		l[0].off();
		
		l[1] = new Mumbai();
		l[1].on();
		l[1].off();
		
		l[2] = new Bangalore();
		l[2].on();
		l[2].off();
	}
}
