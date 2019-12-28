package aishwarya;

public class MutableStrings {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Deloitte");
		System.out.println(sb1);
		sb1.append(" Hyderabad");
		System.out.println(sb1);
		System.out.println(sb1.length());
		System.out.println(sb1.delete(6,10));
		System.out.println(sb1.reverse());
		System.out.println(sb1.replace(6, 11, " JAVA "));
		String str="Dabang3";
		StringBuffer sb2= new StringBuffer();
		sb2.append(str);
		System.out.println(sb2);
		String str2 = sb2.toString();
		System.out.println(str2);
		StringBuilder builder = new StringBuilder();
		builder.append("End");
		System.out.println(builder);
	}

}
