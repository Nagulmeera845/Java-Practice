package Arrays;

import java.util.Scanner;

//WAP to print the min num using from an array by using below userdefine method
public class Prog_9 {

	public static void min(int a[]) {
    int min =a[0];
    for(int i=1;i<a.length;i++) {
    	if(a[i]<min) {
    		min=a[i];
    	}}
    System.out.println("Min from array:"+min);
	}
   public static void main (String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size:");
	   int size=sc.nextInt();
	   System.out.println("Enter Array Values are:");
	   int a[]=new int[size];
	   for(int i=0;i<size;i++) {
		   a[i]=sc.nextInt();
	   }
	   min(a);
	   sc.close();
   }
}
