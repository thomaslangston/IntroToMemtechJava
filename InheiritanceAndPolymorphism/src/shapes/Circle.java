package shapes;

public class Circle implements IShape {

	double diameter;
	
	public Circle(double d)
	{
		diameter = d;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*(diameter/2)*(diameter/2);
	}

}
