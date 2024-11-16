package Arrays;

import java.util.Scanner;

public class Prog_7 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Array size:");
    int size=sc.nextInt();
    System.out.println("Enter Array values are:");
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("Even Index Position values from array");
    for(int j=0;j<size;j++) {
    	if(j%2==0)
    		System.out.println(a[j]);
    }
    sc.close();
	}
  }
