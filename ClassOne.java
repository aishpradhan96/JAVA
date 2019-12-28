package javapro;

public abstract class ClassOne {
	protected int x;
	protected int y;
	public ClassOne(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void display(){
		System.out.println("Concrete method");
	}
	abstract void output();

}
