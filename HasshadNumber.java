package study.codereview;

import java.util.Scanner;

public class HasshadNum {
	public static void main(String[] args) {
		int inputNum;
		boolean solRes;
		
		Scanner scan = new Scanner(System.in);
				
		
		while(true) {
			System.out.println("입력한 정수가 하샤드 수 인지를 판별합니다.");
			System.out.print("숫자 입력 (1~10000) : ");
			inputNum = scan.nextInt();
			
			
			if(inputNum < 1 || inputNum > 10000) {
				System.out.println("숫자의 범위를 벗어났습니다. 프로그램을 종료합니다.");
				break;
			}else {
				solRes = Solution(inputNum);
				if(solRes==true){
					System.out.println(inputNum + "은 하샤드 수 입니다.");
					continue;
				}else {
					System.out.println(inputNum + "은 하샤드 수 가 아닙니다.");
					continue;
				}
			}
			
		}
	}
	
	static boolean Solution(int x) {
		int length = (int)(Math.log10(x)+1);	// 정수 x의 자리 수(길이)를 계산
		int sum = 0;	// 각 자리수의 합
		int temp = 0; // 초기 수 저장할 녀석
		int[] arr = new int[length];	// 각 자리수 저장
		
		temp = x;
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = x % 10;	// 각 자리수 저장될꺼고
			x = x / 10;	// 자리수 하나씩 짜를꺼고
		}
		
		for(int j = 0; j < arr.length; j++) {
			sum += arr[j];	// 각 자리수의 합
		}
		
		x = temp; // x 초기값으로 변경
		
		if(x%sum==0) {
			return true;
		}else {
			return false;
		}
	}
}
