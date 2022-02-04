import java.util.*;

public class Main
{
	public static void main(String[] args) {

	    String str = "";
		Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        int count[] = new int[26]; //Declare an array
        for(int i=0;i<str.length();i++)
        {
            int ch = str.charAt(i)-'a';
            count[ch]++;
        }
        //Display
        System.out.println("Length of the string:- " + str.length());
        System.out.println("Count Occurence of each letter");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println( "Count of" + ch + "=" + count[ch-'a']);
        }
	}
}
