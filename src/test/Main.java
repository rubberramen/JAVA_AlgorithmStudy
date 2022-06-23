package test;

import java.util.*;

class Main {	
	public String solution(String str){
		String answer="";
		// int m=Integer.MIN_VALUE, pos;
		int m=Integer.MIN_VALUE;
		int pos;
		while((pos=str.indexOf(' '))!=-1){
			String tmp=str.substring(0, pos);
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		if(str.length()>m) answer=str;  // 마지막 단어
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
 2번 방법 : indexOf(), subString()
 	- indexOf() : 첫번째로 발견되는 인덱스의 위치 반환, 띄어쓰기를 못 찾으면 -1 반환
 	- subString()
 */
 