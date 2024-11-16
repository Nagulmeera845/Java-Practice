
public class Switchcase {

	public static void main(String[] args) {
     char letr='F';
     switch(letr) {
     case 'a':
     case 'e':
     case 'i':
     case 'o':
     case 'u':System.out.println(letr+": is vowel");
     break;
     
     case 'A':
     case 'E':
     case 'I':
     case 'O':
     case 'U':System.out.println(letr+": is Capital vowel");
     break;
    	 
     default:System.out.println(letr+": is consonent");
      
     }

}
}