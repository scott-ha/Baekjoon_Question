package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 한수 판단 문제.. X의 각 자리수가 등차 수열을 이
public class Q_1065 {

	public static int isHansu(int a) {
		int num1 = a / 100;
		int num2 = (a/10) % 10;
		int num3 = a%10;
		
		if(num2*2 == num1 + num3) {
			return 1;
		} else {
			return 0;
		}
		
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 1-99는 모두 한수로 본다.
		int cnt = 99;
		if(N<100) {
			System.out.println(N);
		} else {
			for(int i=100;i<=N;i++) {
				cnt += isHansu(i);
			}
			System.out.println(cnt);
		}
		

	}

}
