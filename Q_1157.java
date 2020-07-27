package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 가장 많이 사용된 알파벳??? 대소문 구분 x
// 여러 개일경우 ?
public class Q_1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		
		int[] cnt = new int[26];
		int max = 0;
		char result = '?';
		
		// array
		for(int i=0;i<input.length();i++) {
			cnt[input.charAt(i)-65]++;
			if(max<cnt[input.charAt(i)-65]) {
				max = cnt[input.charAt(i)-65];
				result = input.charAt(i);
			} else if (max==cnt[input.charAt(i)-65]) {
				result = '?';
			}
		}
		br.close();
		System.out.println(result);
	}

}
