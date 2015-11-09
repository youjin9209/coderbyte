package coderbyte;
import java.util.*; 
import java.io.*;
/*
 * 9. TimeConvert
 *  have the function TimeConvert(num) take the num parameter being passed and 
 *  return the number of hours and minutes the parameter converts to 
 *  (ie. if num = 63 then the output should be 1:3). 
 *  Separate the number of hours and minutes with a colon. 
 *  ex/ Input = 126 -> Output = "2:6" input = 45 -> Output = "0:45"
 */
public class Function9 {
	 void TimeConvert(int num) { 
		    
		    System.out.println(num/60 +":" + num%60);
		    
		    
		  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
	    Function9 c = new Function9();
	    c.TimeConvert(s.nextInt()); 
	}

}
