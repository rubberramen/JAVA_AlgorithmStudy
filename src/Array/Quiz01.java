package Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
 1. 큰 수 출력하기
 
설명

N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

(첫 번째 수는 무조건 출력한다)


입력
첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.


출력
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다
 */

public class Quiz01 {

	public ArrayList<Integer> solution(int n, int[] arr){
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);   // [0]은 무조건 추가
		for(int i=1; i<n; i++){
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		
		return answer;
	}

	public static void main(String[] args){
		Quiz01 T = new Quiz01();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		
		int[] arr=new int[n];    // 배열을 동적으로 입력 받음
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}