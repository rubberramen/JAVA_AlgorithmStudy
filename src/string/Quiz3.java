package string;
import java.util.*;

public class Quiz3 {
	// 메서드 로직
	public String solution(String str){
		String answer="";
		int m=Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;
				answer=x;
			}
		}
		return answer;
	}
	// 입력 받기, 실행
	public static void main(String[] args){
		Quiz3 T = new Quiz3();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}