package helloWorld;

public class Maruti extends Car{
	boolean isAbs;
	
	public boolean isAbs() {
		return isAbs;
	}

	Maruti(int fuelCapacity, boolean isAbs){
		super(fuelCapacity);
		this.isAbs = isAbs;
	}
//	public void color(){
//		System.out.println("I am rangeela MARUTI kaar");
//	}
	public void carWheels(){
		System.out.println("DAAAAAAAAAAAMN!");
	}
}
