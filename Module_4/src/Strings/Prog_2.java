package Strings;

import java.util.Scanner;

public class Prog_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1=new String(sc.nextLine());
		int len=s1.length();
		System.out.println("Length of string is: "+len);
		for(int i=0;i<len;i=i+2) {
			char ch=s1.charAt(i);
			System.out.println(ch);
		}
		sc.close();
		
	}

}
