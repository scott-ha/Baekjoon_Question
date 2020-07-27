package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10250 {

	public static String solution(int h, int w,int n) {

		// n/6 : number, n%6 : floor
		int number = (n/h) + 1;
		int floor = n%h;
		
		if(floor == 0) {
			floor = h;
			number = (n/h);
		} 
		StringBuilder sb = new StringBuilder();
		if(number<10) {
			sb.append(floor).append('0').append(number);
		} else {
			sb.append(floor).append(number);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); // 높이
			int W = Integer.parseInt(st.nextToken()); // 너비
			int N = Integer.parseInt(st.nextToken()); // 사람 수
			System.out.println(solution(H,W,N));
		}

	}

}
