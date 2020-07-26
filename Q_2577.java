package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// a,b,c
// axbxc 결과에서 0-9 각각의 숫자가 몇번씩 쓰였는지..

public class Q_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c,num;
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		num = a*b*c;
		br.close();
		
		int[] counts = new int[10];
		StringBuilder sb = new StringBuilder();
		// 자릿수별 몫으로..
		while(num>0) {
			counts[num % 10]++;
			num /= 10;
		}
		
		for(int i=0;i<counts.length;i++) {
			sb.append(counts[i] + "\n");
		}
		System.out.println(sb);
	}

}
