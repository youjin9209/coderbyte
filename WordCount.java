package coderbyte;
import java.util.*; 
import java.io.*;
/* 13. WordCount(
 * WordCount(str) take the str string parameter being passed and return the number of words the string contains 
 * (ie. "Never eat shredded wheat" would return 4). Words will be separated by single spaces.
 * ex /  Input = "Hello World" -> Output = 2 / Input = "one 22 three" -> Output = 3
 */
public class Function13 {
	int WordCount(String str) { 
		StringTokenizer st = new StringTokenizer(str," ");   
	    String[] result = new String[st.countTokens()];
	   
	    //tokenizer한거 배열에 담아
	    for(int i=0;i<result.length;i++) {
	    	result[i] = st.nextToken();	
	    }
	    return result.length;
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
	    Function13 c = new Function13();
	    System.out.print(c.WordCount(s.nextLine()));
	}

}
