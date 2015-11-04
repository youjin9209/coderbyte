package coderbyte;
import java.util.*; 
import java.io.*;
/* 3. LongestWord
 *  have the function LongestWord(sen) take the sen parameter being passed 
 *  and return the largest word in the string. If there are two or more words that are the same length, 
 *  return the first word from the string with that length.
 *  Ignore punctuation and assume sen will not be empty. 
 *  ex. "I love dogs" -> "love" / "fun&!! time" -> "time"
 */
public class Function3 {
		String LongestWord(String sen) { 
		
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */     
	    StringTokenizer st = new StringTokenizer(sen," ");   
	    String token = "";
	    String finalArray="";
	    
	    int k;
	    String[] result = new String[st.countTokens()];
	    String max ="";
	    
	    for(int i=0;i<result.length;i++){
	    	result[i] = st.nextToken();	
	    }
	    for(k=0;k<result.length;k++){
	    	if(result[k].length()>max.length()){
	    		max = result[k];
	    	}
	    }
	    
	    return max;
	    
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function3 c = new Function3();
	    System.out.print(c.LongestWord(s.nextLine())); 
	}

}
