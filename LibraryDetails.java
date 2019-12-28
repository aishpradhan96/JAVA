package javapro;

public class LibraryDetails extends Student{
	protected int booksDue;

	public LibraryDetails(int regNo, String stdName, String group, int booksDue) {
		super(regNo, stdName, group);
		this.booksDue = booksDue;
	}


}
