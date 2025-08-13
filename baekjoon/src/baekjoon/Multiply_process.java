package baekjoon;

import java.util.Scanner;

public class Multiply_process {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = (b%10) * a;
		int d = ((b/10%10) * a);
		int e = (b/100) * a;
		int f = (e*100) + (d*10) + c;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		scanner.close();
		
		
		

	}

}
