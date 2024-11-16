package Arrays;

import java.util.Scanner;

//WAP to print the min num using from an array by using below userdefine method

public class Prog_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter Array values are:");
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
		}}
		System.out.println("Max number from given array values:"+max);
		sc.close();
		}
	}


