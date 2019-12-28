package aishwarya;

public class DisplayName {

	public static void main(String[] args) {
		char nameArr[]=args[0].toCharArray();
		for(int i=0;i<args[0].length();i++)
		{
			System.out.println(nameArr[i]);
		}
		for(int i=0;i<=args[0].length();i++){
			for(int j=0;j<i;j++)
			System.out.print(args[0].charAt(j));
		System.out.println();
		}
	}

}
