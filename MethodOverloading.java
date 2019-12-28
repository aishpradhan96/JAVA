package aishwarya;

public class MethodOverloading {
	
	void add(int x, int y){
		System.out.println("int "+(x+y));
	}
	void add(double x, double y){
		System.out.println("double "+(x+y));
	}
	void add(String x, String y){
		System.out.println("String "+(x+y));
	}

	public static void main(String[] args) {
		MethodOverloading methods = new MethodOverloading();
		methods.add(23.81, 21.9);
	}

}
