package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 3
// *
// **
// ***
// **
// *

// StringBuilder, BufferedWriter 성능비

public class Q_2523_BufferedWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=N;i++) { // 0-2
			for(int j=0;j<i;j++) { // 0-3
				sb.append("*");
			}
			sb.append("\n");
		}
		
		for(int i=N-1;i>0;i--) { // 4
			for(int j=0;j<i;j++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);

	}

}
