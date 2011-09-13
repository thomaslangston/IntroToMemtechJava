package shapes;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IShape shape = new Square(2);
		
		System.out.println(shape.getArea());
		
		shape = new Circle(2);
		
		System.out.println(shape.getArea());

	}

}
