package javapro;

public class ClassOneApplication extends ClassOne{
	

	public ClassOneApplication(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		ClassOne one = new ClassOneApplication(2,3);
		one.output();
		one.display();

	}
	@Override
	void output() {
		System.out.println("Overriden");
	}

}
