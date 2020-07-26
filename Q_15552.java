package Question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q_15552 {
	
//	public static int solution(int a, int b) {
//		return a+b;
//	}
//	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		
		int T,a,b;
		T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			
			StringTokenizer st = new StringTokenizer(str, " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
