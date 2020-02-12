import java.util.Scanner;

public class HasshadNum {
	public static void main(String[] args) {
		int inputNum;
		boolean solRes;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력한 정수가 하샤드 수 인지를 판별합니다.");
		System.out.print("숫자 입력 (1~10000) : ");
		inputNum = scan.nextInt();		
		
		Chek:while(inputNum >= 1 && inputNum <= 10000 ) {
			if(inputNum < 1 || inputNum > 10000) {
				System.out.println("숫자의 범위를 벗어났습니다. 프로그램을 종료합니다.");
				break;
			}
			solRes = Solution(inputNum);
			if(solRes==true){
				System.out.println(inputNum + "은 하샤드 수 입니다.");
				break;
			}else {
				System.out.println(inputNum + "은 하샤드 수 가 아닙니다.");
				break;
			}
		}
	}
	
	static boolean Solution(int x) {
		int length = (int)(Math.log10(x)+1);	// 정수 x의 자리 수(길이)를 계산
		int sum = 0;	// 각 자리수의 합
		int temp = 0; // 나눠지는 자리수 저장할 변수
		int[] arr = new int[length];	// 각 자리수 저장
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = x % 10;	// 각 자리수 저장될꺼고
			temp = x / 10;	// 자리수 하나씩 짜를꺼고
		}
		
		for(int j = 0; j < arr.length; j++) {
			sum += arr[j];	// 각 자리수의 합
		}
		
		if(x%sum==0) {
			return true;
		}else {
			return false;
		}
	}
}
