package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// height V
// day +A, night -B
public class Q_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		// ??????????? 시간초과....
//		int go=0;
//		int day = 1;
//		
//		while(true) {
//			go += A;
//			if(go>=V) break;
//			go -= B;
//			day++;
//		}
		
		int day = (V - B) / (A - B);
		if((V-B)%(A-B)!=0) {
			day++;
		}
		
		System.out.println(day);


	}

}
