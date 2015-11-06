package coderbyte;
import java.util.*;
import java.io.*;
/*
 * 6.LetterCapitalize
 *  Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed 
 *  and capitalize the first letter of each word. Words will be separated by only one space. 
 *  Input = "hello world"Output = "Hello World"
 */
 
public class Function6 {
	String LetterCapitalize(String str) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
		StringTokenizer st = new StringTokenizer(str," ");   
	    String token = "";
	    
	    int k=0;
	    String[] result = new String[st.countTokens()];
	    for(int i=0;i<result.length;i++) {
	    	result[i]= st.nextToken();
	    }
	    for(k=0;k<result.length;k++){
	    	str +=  result[k].substring(0, 1).toUpperCase()+result[k].substring(1, result[k].length())+" ";
	    }
	    return str;
	    
	  } 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function6 c = new Function6();
	    System.out.print(c.LetterCapitalize(s.nextLine())); 
	}

}
