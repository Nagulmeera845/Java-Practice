package Arrays;

import java.util.Scanner;

public class Prog_13 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Size:");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    for(int i=0;i<size;i++) {
	    	a[i]=sc.nextInt();
	       }
	    Secondmin(a);
	    sc.close();
		}
	    public static void Secondmin(int a[]) {
	    	int min=a[0],smin=a[0];
	    	for(int i=0;i<a.length;i++) {
	    		if(a[i]<min) {
	    		smin=min;
	    		min=a[i];
	    		}
	    		else if(a[i]<smin)
	    		smin=a[i];
	    	}
	    System.out.println("Minimum from array:"+min);
	    System.out.println("Second minimum from array:"+smin);
	}}
