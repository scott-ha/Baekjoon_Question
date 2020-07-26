package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Q_2439_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				bw.write(" ");
			}
			
			for(int j=0;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		

	}

}
