package helloWorld;

public class CarClient {
	
	public static void doMyJob(Car c){
		c.color();
		if(c instanceof Ford){
			((Ford) c).musicPlayer();
		}
		if(c instanceof Maruti){
			((Maruti) c).carWheels();
		}
	}
	
	public static void main(String[] args) {
		Car[] cars = new Car[6];
		cars[0] = new Ford(40);
		cars[1] = new Maruti(45, false);
		
		cars[2] = new Ford(21);
		cars[3] = new Maruti(22, false);
		
		cars[4] = new Ford(32);
		cars[5] = new Maruti(33, false);
		//someShit();
		
		for(Car temp : cars){
			doMyJob(temp);
		}
		
		
//		Ford figo = new Ford(50);
//		figo.color();
//		figo.musicPlayer();
//		
//		Maruti swift = new Maruti(99, true);
//		swift.carWheels();
//		System.out.println("SWIFT KA MILEAGE " + swift.getFuelCapacity());
	
	}

	private static void someShit() {
		Car c = null;
		c = new Ford(50);
	
		doMyJob(c);
	}
}
