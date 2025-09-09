package baekjoon_250909;

import java.util.Scanner;

public class No10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		String strrev = sb.reverse().toString();
		
		if (str.equals(strrev)) {
			System.out.println(1);
		} else System.out.println(0);
		
		sc.close();

	}

}
