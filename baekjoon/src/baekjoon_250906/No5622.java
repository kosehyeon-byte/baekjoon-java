package baekjoon_250906;

import java.util.Scanner;

public class No5622 {
	public static int time(char ch) {
		int num=0;
		
		if ('A' <= ch && ch <= 'C') {
			num = 3;
		} else if ('D' <= ch && ch <= 'F') {
			num = 4;
		} else if ('G' <= ch && ch <= 'I') {
			num = 5;
		} else if ('J' <= ch && ch <= 'L') {
			num = 6;
		} else if ('M' <= ch && ch <= 'O') {
			num = 7;
		} else if ('P' <= ch && ch <= 'S') {
			num = 8;
		} else if ('T' <= ch && ch <= 'V') {
			num = 9;
		} else if ('W' <= ch && ch <= 'Z') {
			num = 10;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		char[] arr = sc.next().toCharArray();
		for (int i=0; i < arr.length; i++) {
			sum += time(arr[i]);
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
