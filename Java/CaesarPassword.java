package study.codereview;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("문자열 입력(8000자 제한)");
		String str = scan.nextLine();
		System.out.println("입력한 숫자만큼 문자를 밉니다(1 <= n <= 25");
		int pushNum = scan.nextInt();

		Solution sol = new Solution();
		System.out.println("결과 : " + sol.solution(str, pushNum));

	}
}

class Solution {
	public String solution(String s, int n) {
		char[] temp = s.toCharArray();
		String answer="";
		if (s.length() <= 8000 && n >= 1 && n <= 25) {
			for (int i = 0; i < s.length(); i++) {
				if (temp[i] != ' ') {
					if (temp[i] == 'z' || temp[i] == 'Z') {
						temp[i] = (char) (temp[i] + n - 26);
					} else {
						temp[i] = (char) (temp[i] + n);
					}

				} else if (temp[i] == ' ') {
					temp[i] = temp[i];
				}
			}
			answer = new String(temp, 0, temp.length);
		}
			return answer;
		
	}
}
