package Test;

public class Rectangle extends Shape {
	
	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}
	 double areaOfRectangle;
	
	public static void main(String[] args) {
		double length =Double.parseDouble(args[0]);
		double breadth =Double.parseDouble(args[1]);
		Rectangle rectangle = new Rectangle(length,breadth);
		rectangle.area();
	}


	@Override
	void area() {
		areaOfRectangle= length*breadth;
		System.out.println("Area of rectangle is "+areaOfRectangle);
	}


}
