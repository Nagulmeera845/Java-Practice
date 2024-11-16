package Strings;

import java.util.Scanner;

public class Prog_4_1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String s1=new String(sc.nextLine());
    int len=s1.length(),count=0;
    for(int i=0;i<len;i++) {
    	char ch=s1.charAt(i);
    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    		count++;
    	System.out.println(ch);
        }
    System.out.println("length of string is: "+len);
    System.out.println("Total no.of vowels from "+s1+" is :"+count);
	}

}
