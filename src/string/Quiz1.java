package string;
import java.util.*;

public class Quiz1 {
	// 메서드 로직
	public int solution(String str, char t){   
		int answer=0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
//		System.out.println(str+ " " + t);
		/*
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==t) answer++;
		} */
		// 향상된 for문
		for(char x : str.toCharArray()) {   // 스트링은 안됨 이터레이터 -> 배열로 만들어
			if(x == t) answer++;
		}   
		return answer;
	}

	// 입력 받기, 실행
	public static void main(String[] args){
		Quiz1 T = new Quiz1();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();  // 문자열
		char c = kb.next().charAt(0);  // char 타입을 가져옴
		System.out.println(T.solution(str, c));   // 솔루션 호출
	}
}