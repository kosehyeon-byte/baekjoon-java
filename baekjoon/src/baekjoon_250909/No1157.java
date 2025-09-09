package baekjoon_250909;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class No1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		
		String str = br.readLine();
		str = str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			arr[(str.charAt(i) - 'a')] += 1;
			
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		StringBuilder sb = new StringBuilder();
		
		for (int j=0; j < arr.length; j++) {
			if (arr[j] == max) {
				sb.append((char) j + 'a');
			}
		}
			
		
		if (sb.length() > 2) {System.out.println("?");}
		else {System.out.println(sb.toString());}
		
		
	}

}
