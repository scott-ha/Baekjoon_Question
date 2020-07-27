package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2941 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		br.close();
		
		String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0;i<alpha.length;i++) {
			if(str.contains(alpha[i])) {
				str = str.replaceAll(alpha[i], "*");
			}
		}
		
		int cnt = str.length();
		System.out.println(cnt);

	}

}
