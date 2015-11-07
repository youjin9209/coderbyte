package coderbyte;
import java.util.*; 
import java.io.*;
/*
 * 7. SimpleSymbols
 * determine if it is an acceptable sequence by either returning the string true or false. 
 * The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a) 
 * and for the string to be true each letter must be surrounded by a + symbol. 
 * So the string to the left would be false. The string will not be empty and will have at least one letter. 
 * ex/ Input = "+d+=3=+s+"Output = "true" Input = "f++d+"Output = "false"
 */
public class Function7 {
	 String SimpleSymbols(String str) { 
		  	String check ="";
		  	// 한 글자씩 화면에 출력
		    //for (int i = 0; i < str.length(); i++) {
		    //    System.out.println( str.charAt(i) );
		    //}
		  
		  	StringTokenizer st = new StringTokenizer(str,"+");
		  	String[] result = new String[st.countTokens()];
		    
		  	for(int i=0;i<result.length;i++) {
		    	result[i] = st.nextToken();
		   	    System.out.println(result[i]);
		    }
		  	for(int k=0;k<result.length;k++){
		  		//+기준으로 string token을했는데, 각각원소의 length가 1이 아닌게 존재할때. -> false
		  		if(result[k].length()==0){
			    	check = "false";
			    }else {
			     	check ="true";
			  	}
		  	}
			//첫글자가 +나 =로 시작하지 않을때 -> false 
		  	if(str.charAt(0)!='+' && str.charAt(0)!='=' ){
		     	check = "false";
		  	}
		    return check;
		    	
		  } 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function7 c = new Function7();
	    System.out.print(c.SimpleSymbols(s.nextLine()));
	}

}
