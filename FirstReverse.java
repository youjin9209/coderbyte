/*
 * Using the Java language, have the function FirstReverse(str) 
 * take the str parameter being passed and return the string in reversed order. 
 * Use the Parameter Testing feature in the box below to test your code with different arguments.
*/
import java.util.*; 
import java.io.*;

class Function {  
  public String FirstReverse(String str) { 
    // code goes here 
    String rev = "";
    int len = str.length();
    
    for (int i = 0 ; i <len; i++){
        //"abcde".charAt(2)에는 'c'가 읽어 집니다. 0부터 시작하기 때문에 3번째인 'c'가 읽어 집니다.
        rev += str.charAt(len-i-1);
    }
    return rev;
  }      



  public static void main (String[] args) {  
   
    // keep this function call here
    String str = "";
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine())); 
    
  }
} 
