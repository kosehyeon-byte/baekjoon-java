package baekjoon_250905;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		
		for (int i=0; i < t; i++) {
			StringBuilder sb = new StringBuilder();
			int r = sc.nextInt();
			String s = sc.next();
			
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					sb.append(s.charAt(j));
				}
				
			}
			System.out.println(sb.toString());
			
		}
		sc.close();
	}

}
