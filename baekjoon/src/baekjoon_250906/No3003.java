package baekjoon_250906;

import java.util.Scanner;

public class No3003 {

	public static void main(String[] args) {
		int[] ans = {1,1,2,2,2,8};
		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			arr[i] = ans[i] - sc.nextInt();
		}
		
		for (int j=0; j<6;j++) {
			System.out.print(arr[j] + " ");
		}
		
		sc.close();

	}

}
