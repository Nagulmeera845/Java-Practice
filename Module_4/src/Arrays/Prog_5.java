package Arrays;

import java.util.Scanner;

public class Prog_5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of array:");
	 int size=sc.nextInt();
	 System.out.println("Enter Array values:");
	 int a[]=new int[size];
	 for(int i=0;i<size;i++) {
		 a[i]=sc.nextInt();
	 }
	 System.out.println("Your Array reverse values are:");
	 for(int j=size-1;j>=0;j--) {
		 System.out.println(a[j]);
	 }
	 sc.close();
	}

}
