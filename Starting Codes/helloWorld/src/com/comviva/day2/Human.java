package com.comviva.day2;

public class Human extends Eyes implements IAnimal {

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("Human saying BLAH BLAH BLAH!");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human knows how to walk");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("AAAAAAAAARGGGHHHHHHHHH!");
		
	}

}
