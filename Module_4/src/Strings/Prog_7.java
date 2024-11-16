package Strings;

import java.util.Scanner;

public class Prog_7 { //count of words
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String s1=new String(sc.nextLine());
    int len=s1.length(),count=1;
    for(int i=0;i<len;i++) {
    	char ch=s1.charAt(i);
    	if(ch==' ')
    		count++;
    }
    System.out.println("Count of words: "+count);
    sc.close();
    }
	}


