package Arrays;

import java.util.Scanner;

public class Prog_12 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
       }
    Secondmax(a);
    sc.close();
	}
    public static void Secondmax(int a[]) {
    	int max=a[0],smax=a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>max) {
    		smax=max;
    		max=a[i];
    		}
    		else if(a[i]>smax)
    		smax=a[i];
    	}
    System.out.println("Maximum from array:"+max);
    System.out.println("Second maximum from array:"+smax);
}}
