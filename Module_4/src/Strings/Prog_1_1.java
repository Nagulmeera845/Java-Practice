package Strings;

import java.util.Scanner;

public class Prog_1_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string:");
	String s1=new String(sc.nextLine());
	int len=s1.length();
	System.out.println("Length of "+s1+" is:"+len);
	for(int i=0;i<len;i++) {
		char ch=s1.charAt(i);
	System.out.println(ch);
	}
	sc.close();
}
}
