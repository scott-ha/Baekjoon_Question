package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 문자열 반복
public class Q_2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int num = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			for(int j=0;j<S.length();j++) {
				for(int k=0;k<num;k++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);

	}

}
