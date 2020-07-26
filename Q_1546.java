package Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1546 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int[] scores = new int[N];
		int max = 0, sum=0;
		br.close();
		
		for(int i=0;i<N;i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			sum += scores[i];
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		
		double avg = (double)sum / (double)max * 100 / N;
		System.out.println(avg);

	}

}
