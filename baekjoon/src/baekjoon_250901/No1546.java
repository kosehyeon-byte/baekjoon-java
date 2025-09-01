package baekjoon_250901;

import java.util.Scanner;
import java.util.Arrays;

public class No1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] score = new int[num];
		
		
		for (int i=0; i < num; i++) {
			score[i] = sc.nextInt();
		}
		
		int max = Arrays.stream(score).max().getAsInt();
		double sum = 0;
		
		for (int i=0; i < num; i++) {
			double score2 = ((double)score[i]/max)*100;
			sum += score2;
		}
		
		System.out.println(sum / num);
		
		sc.close();
	}

}
