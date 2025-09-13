package baekjoon_250913;

import java.util.StringTokenizer;
import java.util.*;
import java.io.*;

public class No25206_better {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};
		double[] doarr = {4.5 , 4.0 , 3.5 , 3.0 , 2.5 , 2.0 , 1.5 , 1.0 , 0.0};
		double sum = 0;
		double sumlen = 0;
		
		
		for (int i = 0; i < 20; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			String str1 = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			for (int j=0; j < arr.length; j++) {
				if (grade.equals(arr[j])) {double gradenum = doarr[j];}
			}
			
			
			
			
        }
		

	}

}
