package baekjoon_250903;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		for (int i=0; i < n; i++) {
			String str2 = str.substring(i,i+1);
			sum += Integer.parseInt(str2);
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
