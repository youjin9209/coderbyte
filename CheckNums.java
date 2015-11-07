package coderbyte;
import java.util.*; 
import java.io.*;
/*
 * 8.CheckNums
 * take both parameters being passed and return the string true if num2 is greater than num1, 
 * otherwise return the string false. If the parameter values are equal to each other then return the string -1. 
 * ex. Input = 3 & num2 = 122 Output = "true"/ Input = 67 & num2 = 67 Output = "-1"
 */
public class Function8 {
	String CheckNums(int num1, int num2) { 
		String check ="";  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	    if(num1 < num2) {
	    	check = "true";
	    }else if(num1 > num2) {
	    	check = "false";
	    }else {
	    	check ="-1";
	    }
	    return check;
	    
	  } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// keep this function call here     
	    Scanner  s = new Scanner(System.in);
	    Function8 c = new Function8();
	    System.out.print(c.CheckNums(s.nextInt(),s.nextInt()));
	}

}
