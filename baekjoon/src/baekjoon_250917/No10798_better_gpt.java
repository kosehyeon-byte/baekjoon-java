package baekjoon_250917;

import java.io.*;

public class No10798_better_gpt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strarr = new String[5];

        // 5개의 문자열을 입력받기
        for (int i = 0; i < 5; i++) {
            strarr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        // 가장 긴 문자열의 길이에 맞춰 반복
        int maxLength = 0;
        for (String str : strarr) {
            maxLength = Math.max(maxLength, str.length());
        }

        // 각 열을 읽어서 StringBuilder에 추가
        for (int j = 0; j < maxLength; j++) {
            for (int k = 0; k < 5; k++) {
                if (j < strarr[k].length()) {
                    sb.append(strarr[k].charAt(j));
                }
            }
        }

        // 결과 출력
        System.out.println(sb.toString());

        br.close();
    }
}
