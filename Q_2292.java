package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 벌집 최소의 방
public class Q_2292 {
	
	public static int solution(int n) {
		// 1 7 19 37 61 계차6인 수열
		// a(n) = a(n-1) + 6(n-1) *a(0)=1
		int i=1; // 지나가는 방의수 
		int tmp=1;
		int range=1;  
		
		while(true) {
			if(n<=range) {
				break;
			}
			tmp = 6*(i++);
			range += tmp;
		}
		return i;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		System.out.println(solution(N));
	}

}
