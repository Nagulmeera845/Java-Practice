
public class Sum_Pdt_Count_Evennum {

	public static void main(String[] args) {
    int count=0,sum=0,pdt=1;
    for(int i=10;i>=1;i--) {
    	if(i%2==0) {
    		count++;
            sum=sum+i;
            pdt=pdt*i;
	}}
    System.out.println(count);
    System.out.println(sum);
    System.out.println(pdt);
	}
}
