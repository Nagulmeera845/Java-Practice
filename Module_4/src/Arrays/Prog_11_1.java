package Arrays;

import java.util.Scanner;

public class Prog_11_1 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
    }
    maxmindiff(a);
    sc.close();
	}
	
  
public static void maxmindiff(int a[]) {
	int max=a[0],min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
		max=a[i];
		}
		else if(a[i]<min) { 
		min=a[i];
		
	  }}
		System.out.println("Maximum from array:"+max);
		System.out.println("Minimum from array:"+min);
		int diff=max-min;
		System.out.println("Diff is:"+max+"-"+min+"="+diff);
	}}
