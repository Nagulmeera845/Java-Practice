
public class Primeor_not_Forloop {

	public static void main(String[] args) {
      int num=5,count=0;
		for(int i=1;i<=num;i++) 
			if(num%i==0) 
				count++;
			
		if(count==2)
			System.out.println(num+": is prime num");
	}

}
