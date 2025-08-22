package baekjoon_250823;

import java.util.Scanner;
import java.util.Arrays;

public class No10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[0] + " ");
		System.out.println(arr[n-1]);
		
		sc.close();

	}

}
