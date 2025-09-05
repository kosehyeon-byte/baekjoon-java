package baekjoon_250903;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for (char c = 'a'; c <= 'z'; c++) {
			sb.append(str.indexOf(c)).append(" ");
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}

}
