package Strings;

import java.util.Scanner;

public class Prog_9 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
	String s1=new String(sc.nextLine());
	String str[]=s1.split(" ");
	String max=str[0];
	for(int i=1;i<str.length;i++) {
		if(str[i].length()>max.length())
			max=str[i];
	}
	System.out.println(max);
	}

}
