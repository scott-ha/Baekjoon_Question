package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Q_2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<9; i++) {
			bw.write(n + " * " + (i+1) + " = " + n*(i+1) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
