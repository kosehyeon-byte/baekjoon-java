package baekjoon_250901;

import java.util.Scanner;

public class No27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String[] strarr = str.split("");
		
		int i = sc.nextInt();
		System.out.println(strarr[i-1]);
		
		sc.close();
	}

}
