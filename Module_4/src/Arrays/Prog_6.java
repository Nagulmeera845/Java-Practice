package Arrays;

import java.util.Scanner;

public class Prog_6 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size:");
    int size=sc.nextInt();
    System.out.println("Enter your array values are:");
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("Even from given array values are:");
    for(int j=0;j<size;j++) {
    	if(a[j]%2==0)
    		System.out.println(a[j]);
    }
    sc.close();
	}

}
