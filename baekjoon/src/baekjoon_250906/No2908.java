package baekjoon_250906;

import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		char[] ach = a.toCharArray();
		String b = sc.next();
		char[] bch = b.toCharArray();
		
		for (int i = 0; i < (a.length()/2); i++) {
			char temp = ach[i];
			ach[i] = ach[a.length()-1-i];
			ach[a.length()-1-i] = temp;
		}
		
		for (int i = 0; i < (b.length()/2); i++) {
			char temp = bch[i];
			bch[i] = bch[b.length()-1-i];
			bch[b.length()-1-i] = temp;
		}
		
		a = new String(ach);
		b = new String(bch);
		int ia = Integer.parseInt(a);
		int ib = Integer.parseInt(b);
		
		if (ia >= ib) {
			System.out.println(ia);
		} else {
			System.out.println(ib);
		}
		
		sc.close();

	}

}
