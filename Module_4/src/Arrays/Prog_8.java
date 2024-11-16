package Arrays;

public class Prog_8 {
	//Click on run dropdown->run config->args->Enter values ->apply->run
	 

	public static void main(String[] args) {
    int sum=0;
    for(int i=0;i<args.length;i++) {
    	if(Integer.parseInt(args[i])%2==0)
    		sum=sum+Integer.parseInt(args[i]);
    }
    System.out.println("Sum of even :"+sum);
	}

}
