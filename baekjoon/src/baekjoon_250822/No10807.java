package baekjoon_250822;

import java.util.Scanner;

public class No10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] intarr = new int[n];
		for (int i=0; i < n; i++) {
			intarr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		int ans = 0;
		
		for (int i=0; i < n; i++) {
			if (intarr[i] == v) {
				ans += 1;
			}
		}
		
		System.out.println(ans);
			
		sc.close();

	}

}
