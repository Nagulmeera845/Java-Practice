package Strings;

import java.util.Scanner;

public class Prog_6 { //to given string is palindrome or not
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String S1=new String(sc.nextLine());
		int len=S1.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			char ch=S1.charAt(i);
			rev=rev+ch;
		}
		System.out.println("Reverse of String:"+rev);
		if(S1.equalsIgnoreCase(rev))
			System.out.println(rev+" : is palindrome string");
		else
			System.out.println(rev+" : is not palindrome string");
		sc.close();
		}
	}


