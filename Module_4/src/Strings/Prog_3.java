package Strings;

import java.util.Scanner;

public class Prog_3 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String s1=new String(sc.nextLine());
    int len=s1.length(),count=0;
    System.out.println("Length of string is:"+len);
    for(int i=0;i<len;i++) {
    	char ch=s1.charAt(i);
    	if(ch=='m')
    		count++;
       }
    System.out.println("Total no.of e's present in given "+s1+" is:"+count);
    sc.close();
	}

}
