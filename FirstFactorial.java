import java.util.*;
import java.io.*;

class Function {
	int num;
	int FirstFactorial(int num){
		// code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
		if(num==1)
			return 1;
		else if(num>2)
			num = num*FirstFactorial(num-1);
			
		
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Function c = new Function();
		
		System.out.print(c.FirstFactorial(s.nextInt()));
	}

}
