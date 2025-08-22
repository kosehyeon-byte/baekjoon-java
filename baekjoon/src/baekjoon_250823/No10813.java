package baekjoon_250823;

import java.util.Scanner;

public class No10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] basket = new int[n];
		int i,j;
		
		for (int a=0; a < n; a++) {
			basket[a] = a+1;
		}
		
		for (int b=0; b < m; b++) {
			i = sc.nextInt();
			j = sc.nextInt();
			int temp = basket[i-1];
			basket[i-1] = basket[j-1];
			basket[j-1] = temp;
		}
		
		for (int c=0; c < n; c++) {
			System.out.print(basket[c] + " ");
		}
			
		sc.close();


	}

}
