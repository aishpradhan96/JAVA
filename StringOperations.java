package aishwarya;

public class StringOperations {
	public static void main(String[] args) {
		String str = "deloitte";
		System.out.println("length "+str.length());
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.charAt(6));
		System.out.println(str.isEmpty());
		System.out.println(str.substring(4));
		System.out.println(str.substring(3, 7));
		System.out.println(str.toUpperCase());
		System.out.println(str.concat(" hyderabad"));
		System.out.println(str.compareTo("Deloitte"));
		System.out.println(str.equals("Deloitte"));
		System.out.println(str);
	}

}
