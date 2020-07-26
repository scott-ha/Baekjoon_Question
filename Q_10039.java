package Question;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 5명
// score > 40 score = score
// score < 40 score = 40
// sum ?

public class Q_10039 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] scores = new int[5];
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {	
			scores[i] = Integer.parseInt(br.readLine());
			sum += scores[i]>40 ? scores[i] : 40;
		}
		
		// 아스키 단위 넘어가면 integer 출력 안됨
		// String.valueof()로 해결하자.
		bw.write(String.valueOf(sum/5));
		br.close();
		bw.flush();
		bw.close();
	}

}
