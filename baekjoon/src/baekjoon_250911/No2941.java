package baekjoon_250911;

import java.util.Scanner;

public class No2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		String pad = "0";
		String str = sc.next();
		String[] arr = {"c=","c-","lj","nj","dz=","d-","s=","z="};
		
		for (String ch : arr) {
			int idx;
			while ((idx = str.indexOf(ch)) != -1) {
				num+=1;
				int start = idx;
				int end = idx + ch.length();
				str = str.substring(0,start) + pad + str.substring(end);
			}
		}
		
		str = str.replace(pad, "");
		num+=str.length();
		
		System.out.println(num);
		sc.close();

	}

}
