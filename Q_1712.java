package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1712 {
	
	public static int BREAK_EVENPoint(int a, int b, int c) {
		int num=0;
		
		if((c-b)<=0) {
			num = -1;
		} else {
			num = (a/(c-b)) + 1;
		}
		return num;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		System.out.println(BREAK_EVENPoint(A,B,C));
	}

}
