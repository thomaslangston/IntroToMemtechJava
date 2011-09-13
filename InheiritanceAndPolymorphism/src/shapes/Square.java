package shapes;

public class Square implements IShape {

	public double width;
	public Square(double w)
	{
		width = w;
	}
	
	@Override
	public double getArea() {
		return width*width;
	}

}
