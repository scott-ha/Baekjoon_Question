package Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2588 {

	public static void solution(int a, int b) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(a * (b%10));
		sb.append("\n");
		
		sb.append(a * ((b%100)/10));
		sb.append("\n");
		
		sb.append(a * (b/100));
		sb.append("\n");
		
		sb.append(a*b);
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		
		solution(a,b);
	}

}

