package coderbyte;
import java.util.*; 
import java.io.*;
/*5. SimpleAdding
 * Using the Java language, have the function SimpleAdding(num) add up all the numbers from 1 to num. 
 * For the test cases, the parameter num will be any number from 1 to 1000. 
 *  
 */

public class Function5 {
	 int SimpleAdding(int num) { 
		  int sum=0;
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	    for(int i=1;i<=num;i++){
	    	sum+=i;
	    }   
	    return sum;
	    
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function5 c = new Function5();
	    System.out.print(c.SimpleAdding(s.nextInt())); 
	}

}
