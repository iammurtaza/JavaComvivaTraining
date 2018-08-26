package helloWorld;

public class ShapeClient {
	public static void main(String[] args) {
		Shape s = new Rectangle();
		
		s.draw();
		s.area();
		
		s = new Circle();
		s.draw();
		s.area();
		
	
	}
}
