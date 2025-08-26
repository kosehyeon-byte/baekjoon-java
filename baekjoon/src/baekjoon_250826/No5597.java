package baekjoon_250826;

import java.util.Scanner;
import java.util.Arrays;

public class No5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 1; i < 29; i++) {
			int a = sc.nextInt();
			for (int j = 0; j < arr.length; j++) {
				if (a == arr[j]) {
					arr[j] = 0;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println(arr[28]);
		System.out.println(max);
		
		sc.close();

	}

}
