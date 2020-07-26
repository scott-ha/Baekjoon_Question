package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

// 3
// *
// **
// ***
// **
// *

// StringBuilder, BufferedWriter 성능비

public class Q_2523_StringBuilder {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) { // 0-2
			for(int j=0;j<i;j++) { // 0-3
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i=N-1;i>0;i--) { // 4
			for(int j=0;j<i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}
