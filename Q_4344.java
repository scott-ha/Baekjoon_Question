package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_4344 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());
		
		int[] arr = new int[C];
		
		for(int i=0;i<arr.length;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			int num = Integer.parseInt(st.nextToken());
			
			int[] scores = new int[num];
			int sum = 0;
			float avg =0;
			
			for(int j=0;j<num;j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				sum += scores[j];
			}
			avg = (float)sum / (float)num;
			int cnt=0;
			float portion = 0;
			for(int j=0;j<num;j++) {
				if(scores[j]>avg) {
					cnt++;
				}
			}
			portion = (float)cnt / (float)num * 100;
			sb.append(String.format("%.3f", portion)).append('%').append('\n');
		}
		System.out.println(sb);
		br.close();
		
	}

}
