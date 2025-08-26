package baekjoon_250826;

import java.util.Scanner;
import java.util.ArrayList;

public class No3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i=0; i < 10; i++) {
			int a = sc.nextInt();
			int remainder = a%42;
			if (!list.contains(remainder)) list.add(remainder);
		}
		
		System.out.println(list.size());
		
		sc.close();

	}

}
