package coderbyte;
import java.util.*; 
import java.io.*;
/* 14.ExOh
 * take the str parameter being passed and return the string true if there is an equal number of x's and o's, 
 * otherwise return the string false. Only these two letters will be entered in the string, no punctuation or numbers. 
 * For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's. 
 * ex/ Input = "xooxxo" -> Output = "true"   Input = "x" -> Output = "false"
 */
public class Function14 {
	String ExOh(String str) { 
		int xIncrements=0;
		int oIncrements=0;
	    String check ="";
	    
	    for (int i = 0; i < str.length(); i++) {
	        if(str.charAt(i)=='x')
	        	xIncrements++;
	        }
	    for(int k=0;k<str.length();k++){
	    	if(str.charAt(k)=='o')
	    		oIncrements++;	
	    }
	    
	    if(xIncrements == oIncrements)
	    		check = "true";
	    else 
	    		check = "false";
	    
	    return check;
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function14 c = new Function14();
	    System.out.print(c.ExOh(s.nextLine()));
	}

}
