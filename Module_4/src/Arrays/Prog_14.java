package Arrays;

import java.util.Scanner;

public class Prog_14 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int size=sc.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size;i++) {
    	a[i]=sc.nextInt();
    }
    SecondMin(a);
    sc.close();
	}
	public static void SecondMin(int a[]) {
		int min=a[0],secmin=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin) {
				secmin=a[i];
			}
		}
		System.out.println("Minimum  from array:"+min);
		System.out.println("Second Minimum from array:"+secmin);
	}

}
