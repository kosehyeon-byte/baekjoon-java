package baekjoon_250913;

import java.io.*;
import java.io.InputStreamReader;

public class No1316_gpt {
	
	private static boolean isGroupWord(String s) {
	    boolean[] seen = new boolean[26];
	    char prev = s.charAt(0);
	    seen[prev - 'a'] = true;

	    for (int i = 1; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c != prev) {
	            if (seen[c - 'a']) return false; // 끊겼다가 다시 나타나면 실패
	            seen[c - 'a'] = true;
	            prev = c;
	        }
	    }
	    return true;
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i < n; i++) {
			String str = br.readLine();
			if (isGroupWord(str) == true) {
				num += 1;
			}
		}
		System.out.println(num);
	}

}
