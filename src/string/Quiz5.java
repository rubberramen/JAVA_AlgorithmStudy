package string;
import java.util.*;

/*
# 5. 특정 문자 뒤집기

## 설명

- 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

- 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


## 입력
- 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


## 출력
- 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */

public class Quiz5 {
	public String solution(String str){
		String answer;
		
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1;
		
		while(lt<rt){   // 외워 놔라
			if(!Character.isAlphabetic(s[lt])) lt++;    // if(lt == 특수문자) lt++ <- 요런 느낌, 특수문자냐?를 물어봄
			else if(!Character.isAlphabetic(s[rt])) rt--;  // if문 : 특수 문자냐?
			else{
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		return answer;
	}

	public static void main(String[] args){
		Quiz5 T = new Quiz5();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}

/*
- Character.isAlphabetic() : 알파벳이면 true
- String.valueOf(s); : 스트링으로 바꿔 줌
*/