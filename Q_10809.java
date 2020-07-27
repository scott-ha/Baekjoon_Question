package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 단어의 위치 없으면 -1
public class Q_10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		// search
		int[] resultarr = new int[26];
		int value = 0;
		
		for(int i=0;i<resultarr.length;i++) {
			resultarr[i] = -1;
		}
		
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			value = (int)c;
			
			if(resultarr[value-97] == -1) {
				resultarr[value-97] = i;
			}
		}
		
		for(int i=0;i<resultarr.length;i++) {
			System.out.print(resultarr[i] + " ");
		}
		
	}

}
