package Primenum;

import java.util.Scanner;

//WAP to print even numbers from 1 to n 
public class Evennum {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num:");
    int n=sc.nextInt();
    System.out.println("Even numbers are 1 to "+n+"is:");
    for(int i=1;i<=n;i++) 
    if(i%2==0)
    System.out.println(i);
    sc.close();
    }
}