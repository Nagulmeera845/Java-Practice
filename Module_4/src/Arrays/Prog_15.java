package Arrays;

import java.util.Scanner;

public class Prog_15 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
        }
    int temp=0;
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    
    for(int j=0;j<a.length-1;j++) {
    	if(a[j]>a[j+1]) {
    		temp=a[j];
    		a[j]=a[j+1];
    		a[j+1]=temp;
    	}
    }
    }
	for(int k=0;k<size;k++) {
		System.out.println(a[k]);
		sc.close();
	}
	}
}
