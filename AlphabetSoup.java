package coderbyte;
import java.util.*; 
import java.io.*;
/*
 * 10. AlphabetSoup
 * take the str string parameter being passed and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
 *	Assume numbers and punctuation symbols will not be included in the string. 
 * ex/ Input = "coderbyte" -> Output = "bcdeeorty" / Input = "hooplah" -> Output = "ahhloop"
 */
public class Function10 {
	String AlphabetSoup(String str) { 
		//Converts this parameter "str" to a new character array "beforeSort" 
		char[] beforeSort = str.toCharArray();
		//char로 바꾼걸로 sorting하기
		Arrays.sort(beforeSort);
		//type casting to string
		String alphabetorder = new String(beforeSort);
		
	    return alphabetorder;
	    
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function10 c = new Function10();
	    System.out.print(c.AlphabetSoup(s.nextLine())); 
	}

}
