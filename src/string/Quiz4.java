package string;
import java.util.*;


/*
# 4. 단어 뒤집기

## 설명
- N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


## 입력
- 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
- 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


## 출력
- N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */

public class Quiz4 {
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
		Quiz4 T = new Quiz4();
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