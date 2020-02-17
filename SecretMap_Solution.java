package study.codereview;

import java.util.Arrays;
import java.util.Scanner;

public class SecretMap {
	public static void main(String[] args) {
		System.out.print("input N : ");
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		
		System.out.println("arr1's input ("+ Num + ") times");
		int[] arr1 = new int[Num];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("arr2's input ("+ Num + ") times");
		int[] arr2 = new int[Num];
		for(int i=0;i<arr2.length;i++){
			arr2[i] = scan.nextInt();
		}
		
		Solution sol = new Solution();
		
		System.out.println(Arrays.deepToString(sol.solution(Num, arr1, arr2)));	
	}
}

class Solution {
	  public String[] solution(int n, int[] arr1, int[] arr2) {
		  
		  String[] answer = new String[n];
		  
		  StringBuffer sb = new StringBuffer();
		  		  
		  for(int i=0;i<n;i++) {
			  int num = arr1[i] | arr2[i];
			  
			  while(num > 0) {
					sb.insert(0, num % 2 == 0? " " : "#");
					num /= 2;
				}
				answer[i] = sb.toString();
				sb.setLength(0);
		  }		        
	      return answer;
	  }
}
