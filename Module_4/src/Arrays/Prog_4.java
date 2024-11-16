package Arrays;

import java.util.Scanner;

public class Prog_4 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of an array");
    int size=sc.nextInt();
    System.out.println("Enter Array values are:");
    String sub[]=new String[size];
    for(int i=0;i<size;i++) {
    	sub[i]=sc.next();
    }
    System.out.println("Array values are: ");
    for(int j=0;j<size;j++) {
    	System.out.println(sub[j]);
    }
    sc.close();
	}

}
