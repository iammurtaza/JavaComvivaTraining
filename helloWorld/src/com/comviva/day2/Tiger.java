package com.comviva.day2;

public class Tiger implements IAnimal{

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("GRRRRRRRRR");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("4 leg thumps the ground");
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("THEY DON'T SHOUT! THEY MAKE YOU SHOUT!");
	}

	public void kill(){
		System.out.println("KILL DEM HUMANS!!!! GRRRRRR GRRRRRR !!!!");
	}
}
