package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q_2884 {

	public static void solution(int H, int M) {
		
		if(M<45) {
			H--;
			M = 60 - (45-M);
			if(H<0) {
				H=23;
			}
			System.out.println(H + " " + M);
		} else {
			M = M - 45;
			System.out.println(H + " " + M);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// H : hour 0-24, M : minute 0-60
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		br.close();
		
		solution(H, M);
		
		
	}

}
