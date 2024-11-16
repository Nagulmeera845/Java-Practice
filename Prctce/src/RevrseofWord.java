
public class RevrseofWord {

	public static void main(String[] args) {
    String str ="I Love Khammam";
    String arr[]=str.split(" ");
    System.out.print("Reverse of word: ");
    for(int i=arr.length-1;i>=0;i--) {
    	System.out.print(arr[i]+" ");
    }
  } 
}
