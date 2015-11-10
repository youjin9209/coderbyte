package coderbyte;
import java.util.*; 
import java.io.*;
/*
 * 11. ABCheck
 * ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places anywhere in the string 
 * at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b). 
 * Otherwise return the string false.
 * ex/  Input = "after badly" -> Output = "false" /  Input = "Laura sobs"Output = "true"
 */
public class Function11 {
	String ABCheck(String str) { 
		String check =""; 
	    /*<String.matches 사용법>
	     * 1. 형식의 시작은 ^ 이고, 끝은 $
	     * 2. '.' 는 모든 범위의 한 문자 
	     * 3. '*'는 앞의 문자가 0개 이상
	     * 4. {숫자}는 앞의 문자가 숫자만큼 반복
	     */
		if(str.matches("^(.)*(a)(.){3}(b)(.)*$"))
			check = "true";
		else 
			check = "false";
		
	    return check;
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
	    Function11 c = new Function11();
	    System.out.print(c.ABCheck(s.nextLine()));
	}

}
