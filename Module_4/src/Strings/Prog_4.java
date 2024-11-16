package Strings;

public class Prog_4 {

	public static void main(String[] args) {
    String s1="shaik nagulmeera";
    int len=s1.length(),count=0;
    for(int i=0;i<len;i++) {
    	char ch=s1.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
    	count++;
    }
    	System.out.println("Total no.of vowels:"+count);
   	}
 }
