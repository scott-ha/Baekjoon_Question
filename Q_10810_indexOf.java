package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 단어의 위치 없으면 -1
public class Q_10810_indexOf {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		// indexOf solution
		for(char c='a';c<'z';c++) {
			sb.append(S.indexOf(c)).append(" ");
		}
		System.out.println(sb);	
	}

}
