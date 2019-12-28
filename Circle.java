package Test;

public class Circle extends Shape{
	

	public Circle(double radius) {
		super(radius);
	}

	final double pi = 3.14;
	double areaOfCircle;

	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		Circle circle = new Circle(radius);
		circle.area();

	}

	@Override
	void area() {
		areaOfCircle= pi*radius*radius;
		System.out.println("Area of circle with radius "+radius+" is "+areaOfCircle);
		
	}

}
