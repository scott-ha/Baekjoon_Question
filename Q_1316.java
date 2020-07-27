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
		
		int cnt = 0;
		int prev = 0;
		
		for(int i=0;i<N;i++) {
			word[i] = br.readLine();
			
			for(int j=0;j<word[i].length();j++) {
				int now = word[i].charAt(j);
				
				if(prev != now) {
					
				}
			}
		}
	}
}
