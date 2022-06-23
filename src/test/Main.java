package test;

import java.util.*;

class Main{	
	public String solution(String str){   
		String answer="";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();

		System.out.println(T.solution(str));
	}
	
}

/**
 * <아스키 코드> 
 * 대문자 : 65 ~ 90(-32 해주면 됨)
 * 소문자 : 97 ~ 122
 */