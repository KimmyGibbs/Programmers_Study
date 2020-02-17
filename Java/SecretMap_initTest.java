package study.codereview;

public class test {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
		
		int[] arr1 = {46, 33, 33, 22, 31, 50};
		int[] arr2 = {27, 56, 19, 14, 14, 10};
		
		int[] bit_res = new int[arr1.length];
		String[] answer = new String[arr1.length];
		
		for(int i=0; i<arr1.length;i++) {
			int num = arr1[i] | arr2[i];	// 비트 연산자; 두 수중 하나라도 이진수1이 있으면 이진수 1을 반환
			bit_res[i] = num;
		}
		
//		System.out.println("비교연산 Decimal 결과");
//		for(int j=0;j<bit_res.length;j++) {
//			System.out.print(bit_res[j]+" ");
//		}
//		System.out.println();
		
		for(int i=0;i<bit_res.length;i++) {
			int num = bit_res[i];
			while(num > 0) {
				sb.insert(0, num % 2 == 0? ' ' : '#');
				num /= 2;
			}
			answer[i] = sb.toString();
			sb.setLength(0);
		}
		
		
		for(int j=0;j<answer.length;j++) {
			System.out.print('"');
			System.out.print(answer[j]);
			System.out.print('"');
			if(j<answer.length-1) {
				System.out.print(", ");
			}
		}
		
	}

}
