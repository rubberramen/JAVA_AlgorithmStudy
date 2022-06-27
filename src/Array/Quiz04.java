package Array;

import java.util.*;



/*
 4. 피보나치 수열
 
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.
 */

public class Quiz04 {

	public String solution(int n, int[] a, int[] b){
		String answer="";

		return answer;
	}
	public static void main(String[] args){
		Quiz04 T = new Quiz04();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		for(int i=0; i<n; i++){
			b[i]=kb.nextInt();
		}
		// 출력을 줄 바꿈으로
		for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
	}
}

/*

*/