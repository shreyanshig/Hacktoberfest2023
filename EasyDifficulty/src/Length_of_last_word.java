import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    int len = 0;
	    for(int i=s.length()-1; i>=0; i--){
	        if(s.charAt(i) == ' ')
	            break;
	        len++;
	    }
	    System.out.println("Length of last word is "+len);
	}
}