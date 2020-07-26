package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q_8393 {

	public static int solution(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(solution(n));

	}

}
