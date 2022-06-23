package string;
import java.util.*;

public class Quiz2 {
	// 메서드 로직
	public String solution(String str){
		String answer="";
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);

		}
		return answer;
	}

	// 입력 받기, 실행
	public static void main(String[] args){
		Quiz2 T = new Quiz2();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}