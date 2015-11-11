package coderbyte;
import java.util.*; 
import java.io.*;
/*15. Palindrome
 * Palindrome(str) take the str parameter being passed and return the string true if the parameter is a palindrome, 
 * (the string is the same forward as it is backward) otherwise return the string false. 
 * For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string. 
 * ex/ Input = "never odd or even" -> Output = "true" / Input = "eye" ->Output = "true"
 */
public class Function15 {
	String Palindrome(String str) { 
		String rev ="";
		String check ="";
		int len = str.length();
	    // str 역순 시키기 
	    for (int i = 0 ; i <len; i++){
	        rev += str.charAt(len-i-1);
	        
	    }
	    //공백 제거해서 문자만 비교해줘야하니까 (trim() 써봤더니 안먹어서 replaceAll 사용)
	    str = str.replaceAll("\\p{Z}", "");
	    rev = rev.replaceAll("\\p{Z}", "");
	    
	    //string 비교
	    if(rev.equals(str))
	    	check="true";
	    else
	    	check ="false";
	    
	    return check;
	    
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function15 c = new Function15();
	    System.out.print(c.Palindrome(s.nextLine())); 
	}	

}
