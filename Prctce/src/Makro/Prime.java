package Makro;

public class Prime {
	public static void main(String[] args) {
		int num=3,count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
			if(count==2)
				System.out.println("Prime num");
			else
				System.out.println("Not prime");
		}
	}