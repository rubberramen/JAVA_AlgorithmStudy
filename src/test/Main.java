package test;

import java.util.*;
class Main {	
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", "");  // [^A-Z] : 알파벳이 아닌 것들
		// System.out.println(s);
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}

/*
- replaceAll에다가는 정규식 쓸 수 있다(replace에는 안됨)
*/