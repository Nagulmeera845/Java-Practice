package Strings;

import java.util.Scanner;

public class Prog_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1=new String(sc.nextLine());
		s1=s1.trim();
		String s2=new String(s1);
		int len=s2.length();
		int count=1;
		for(int i=0;i<len;i++) {
			if(s2.charAt(i)==' '&&s2.charAt(i+1)!=' ')
				count++;
			System.out.println(count);
		}
	}

}
