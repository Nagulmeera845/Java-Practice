package Strings;

public class Prog_2_1 {

	public static void main(String[] args) {
    String s1=new String ("Java Development");
    int len=s1.length();
    System.out.println("length of string is:"+len);
    for(int i=0;i<len;i=i+2) {
    	char ch=s1.charAt(i);
    	System.out.print(ch);
    }
	}
   }
