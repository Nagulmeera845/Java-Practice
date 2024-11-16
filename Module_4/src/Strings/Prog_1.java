package Strings;

public class Prog_1 {
	public static void main(String[] args) {
		String s1=new String("Java Developer");
		int len=s1.length();
		System.out.println("length of String is:"+len);
		for(int i=0;i<len;i++) {
			char ch=s1.charAt(i);
			System.out.println(ch);
	}
		
	}
}
