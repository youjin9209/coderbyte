package coderbyte;
import java.util.*; 
import java.io.*;

/* 12. VowelCount
 *  take the str string parameter being passed and return the number of vowels the string contains (ie. "All cows eat grass" would return 5). 
 *  Do not count y as a vowel for this challenge.
 *  ex / Input = "hello" -> Output = 2 / Input = "coderbyte" -> Output = 3
 */
public class Function12 {
	int VowelCount(String str) { 
		int increments=0;  
		for (int i = 0; i < str.length(); i++) {
	        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
	        	increments++;
	        }
	    return increments;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function12 c = new Function12();
	    System.out.print(c.VowelCount(s.nextLine()));
	}

}
