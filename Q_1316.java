package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 그룹단어
// aaa O
// b O
// aba X

public class Q_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] word = new String[N];
		
		// cnt : group word
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			word[i] = br.readLine();
			checkGroup(word[i]);
		}
		
		br.close();

	}
	
	public static boolean checkGroup(String input) {
		boolean[] alphabet = new boolean[26];
		
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i);
			
			// alphabet array element to true
			alphabet[ch-'a'] = true;
			// check is true
			if(alphabet[(ch-'a')-i]) {
				
			}
		}
		return true;
	}
}
