package baekjoon_250822;

import java.util.Scanner;

public class No2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			String line = new StringBuilder()
				.append(" ".repeat(n-i))
				.append("*".repeat(i))
				.toString();
			System.out.println(line);
		}

		sc.close();
	}

}
