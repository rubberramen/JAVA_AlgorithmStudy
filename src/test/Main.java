package test;

import java.util.*;
class Main {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			char[] s=x.toCharArray();   // 문자 배열화 : toCharArray()
			
			// 직접 교환 : 손코딩 할때, 이 정도는 해야지
			int lt=0, rt=x.length()-1;
			// 양쪽 교환
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}

/*
- toCahrArray()
- String.valueOf(s)
	- s라는 문자 배열을 스트링화, static 메서드
 */